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

/**
 * This class is the web controller.
 * Will try to use RestController in the future implementation
 * @author fire-holder
 *
 */
@Controller
public class webController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    Broadcastrepo broadcastrepo;

    private String user;
    /**
     * Get mapping and go to the home page.
     * @return "home"
     */
    @GetMapping("/")
    public String index() {
        return "home";
    }
    /**
     * Get mapping and go to the home page.
     * @return "home"
     */
    //This might be changed to avoid the circular error.
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    /**
     * Get mapping and go to the register page. 
     * @return "register"
     */
    //This might be changed to avoid the circular error.
    @GetMapping("/register")
    public String register() {
        return "register";
    }

    /**
     * Get mapping and go to the login page. 
     * @return "sign"
     */
    //This might be changed to avoid the circular error.
    @GetMapping("/sign")
    public String login() {
        return "sign";
    }

    /**
     * Get mapping and go to the user page.
     * @return "user"
     */
    //This might be changed to avoid the circular error.
    @GetMapping("/user")
    public String user() {
        return "user";
    }

    /**
     * Get mapping and go to the sha256 page.
     * @return "sha256"
     */
    //This might be changed to avoid the circular error.
    @GetMapping("/sha256")
    public String hash() {
        return "sha256";
    }

    /**
     * Get mapping and go to the block page. 
     * @return "block"
     */
    //This might be changed to avoid the circular error.
    @GetMapping("/block")
    public String block() {
        return "block";
    }
    /**
     * Get mapping and go to animation page.
     * @return modelandview to redirect the page.
     */
    @GetMapping(value = "/animation")
    public ModelAndView animation() {
        return new ModelAndView("redirect:http://localhost:3000");
    }

    /**
     * Post mapping and go to the user page if signed in successfully. 
     * Remain in the sign in page if unsuccessful.
     * @param sig user name that used to sign in.
     * @return "user" if successful, "sign" if unsuccessful.
     */
    @PostMapping(value = "/sign")
    public String login(UserForm sig) {
        if (userRepository.signinUser(sig)) {
            user = sig.getnuid();
            return "user";
        }
        return "sign";
    }

    /**
     * Post mapping and go to the home page if registered.
     * @param reg user name that used to register
     * @return "home"
     */
    @PostMapping(value = "/register")
    public String userInfo(UserForm reg) {
        userRepository.registerUser(reg);
        return "home";
    }


    /**
     * Get mapping and create the transaction, then go to the transaction page.
     * @param model the model to add attribute of tokenList.
     * @return "broadcast"
     */
    //This might be changed to avoid the circular error.
    @GetMapping("/broadcast")
    public String broadcast(Model model) {
        List<Tokenform> ctf = broadcastrepo.findByTokens(user);
        model.addAttribute("tokenList", ctf);
        return "broadcast";
    }
    /**
     * Post mapping and go to the user page after the transaction was created.
     * @param tx the broadcast form used to create transcation.
     * @return "user"
     */
    @PostMapping(value = "/broadcast")
    public String createTX(Broadcastform tx) {
        broadcastrepo.createTransaction(tx, user);
        return "user";
    }

    /**
     * Get mapping and go to the token page.
     * @param model The model used to add attribute tokenList1.
     * @return "token"
     */
    @GetMapping("/token")
    public String token(Model model) {
        List<Tokenform> ctf = broadcastrepo.findByTokens(user);
        model.addAttribute("tokenList1", ctf);
        return "token";
    }
    /**
     * Get mapping and go to the transaction poll.
     * @param model The model used to add attribute poll list.
     * @return "transactionpoll"
     */
    @GetMapping("/poll")
    public String txpoll(Model model) {
        List<Pollform> ctf = broadcastrepo.findByPolls();
        model.addAttribute("tokenList2", ctf);
        return "poll";
    }
    /**
     * Get mapping of "/mining" and go to the home page.
     * @return "home"
     */
    @GetMapping(value = "/mining")
    public String miningpending(Model model) {
        userRepository.miningpending();
        broadcastrepo.minereward(user);
        List<Pollform> ctf = broadcastrepo.findByPolls();
        model.addAttribute("tokenList3", ctf);
        return "proofofwork";
    }
    /**
     * Get mapping of "/search" and go to the search bar page.
     * @return "searchbar".
     */
    @GetMapping("/search")
    public String search() {
        return "searchbar";
    }
    /**
     * Get mapping of "/cardview" and go to the card view page.
     * @param model
     * @return
     */
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
    /**
     * 
     * @param model
     * @param keyword
     * @return
     */
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
