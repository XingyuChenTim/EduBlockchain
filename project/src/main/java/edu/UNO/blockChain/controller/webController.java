package edu.UNO.blockChain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.UNO.blockChain.form.UserForm;
import edu.UNO.blockChain.form.blockChainform;
import edu.UNO.blockChain.form.Broadcastform;
import edu.UNO.blockChain.form.Tokenform;
import edu.UNO.blockChain.form.Pollform;
import edu.UNO.blockChain.repository.UserRepository;
import edu.UNO.blockChain.repository.Broadcastrepo;

/*
 * This class is the web controller.
 * Will try to use RestController in the future implemetation
 */
@Controller
public class webController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    Broadcastrepo broadcastrepo;

    private String user;
    /*
     * Get mapping and go to the home page.
     */
    @GetMapping("/")
    public String index() {
        return "home";
    }
    /*
     * Get mapping and go to the home page.
     */
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    /*
     * Get mapping and go to the register page. This might be changed to avoid the
     * circular error.
     */
    @GetMapping("/register")
    public String register() {
        return "register";
    }

    /*
     * Get mapping and go to the login page. This might be changed to avoid the
     * circular error.
     */
    @GetMapping("/sign")
    public String login() {
        return "sign";
    }

    /*
     * Get mapping and go to the user page. This might be changed to avoid the
     * circular error.
     */
    @GetMapping("/user")
    public String user() {
        return "user";
    }

    /*
     * Get mapping and go to the sha256 page. This might be changed to avoid the
     * circular error.
     */
    @GetMapping("/sha256")
    public String hash() {
        return "sha256";
    }

    /*
     * Get mapping and go to the block page. This might be changed to avoid the
     * circular error.
     */
    @GetMapping("/block")
    public String block() {
        return "block";
    }

    @GetMapping(value = "/animation")
    public ModelAndView animation() {
        return new ModelAndView("redirect:http://localhost:3000");
    }

    /*
     * Post mapping and go to the user page if signed in successfully. Remain in the
     * sign in page if unsuccessful.
     */
    @PostMapping(value = "/sign")
    public String login(UserForm sig) {
        if (userRepository.signinUser(sig)) {
            user = sig.getnuid();
            return "user";
        }
        return "sign";
    }

    /*
     * Post mapping and go to the home page if registered.
     */
    @PostMapping(value = "/register")
    public String userInfo(UserForm reg) {
        userRepository.registerUser(reg);
        return "home";
    }


    /*
     * Get mapping and create the transaction, then go to the transaction page. This
     * might be changed to avoid the circular error.
     */
    @GetMapping("/broadcast")
    public String broadcast(Model model) {
        List<Tokenform> ctf = broadcastrepo.findByTokens(user);
        model.addAttribute("tokenList", ctf);
        return "broadcast";
    }
     /*
     * Post mapping and go to the user page if the transaction was created.
     */
    @PostMapping(value = "/broadcast")
    public String createTX(Broadcastform tx) {
        broadcastrepo.createTransaction(tx, user);
        return "user";
    }


    @GetMapping("/token")
    public String token(Model model) {
        List<Tokenform> ctf = broadcastrepo.findByTokens(user);
        model.addAttribute("tokenList1", ctf);
        return "token";
    }

    @GetMapping("/poll")
    public String txpoll(Model model) {
        List<Pollform> ctf = broadcastrepo.findByPolls();
        model.addAttribute("tokenList2", ctf);
        return "poll";
    }

    @GetMapping(value = "/mining")
    public String miningpending() {
        userRepository.miningpending();
        broadcastrepo.minereward(user);
        return "home";
    }

    @GetMapping("/search")
    public String search() {
        return "searchbar";
    }

    @GetMapping("/cardview")
    public String cardview(Model model) {
        List<blockChainform> blkh = broadcastrepo.findbyCardView();
        model.addAttribute("cardviewitems", blkh);

        // to check if we are getting the attributes
        // for (blockChainform bcf : blkh) {
        //     System.out.println(bcf.getId());
        // }

        return "cardViewBlockchain";
    }

    @GetMapping("/results")
    public String results(Model model, @RequestParam("keyword") String keyword) {
        //System.out.println(keyword);
       List<blockChainform> blch = broadcastrepo.findByKeyword(keyword);
       /* to check if we are getting the required value
       for (Pollform pf : blch){
            System.out.println(pf.getSender());
        }
        */
        model.addAttribute("blockchainlist", blch);
        return "blockview";
    }
}
