
## Introduction
   In recent years, Blockchain technology is growing very fast and there is tons of complex information about Blockchain but there is no clear guideline application for amateurs
   to learn from this new technology. According to Professor Chen’s requirement, our team needs to build a web based simulation which relates to blockchain technology. 

   This application has been used for educational purposes to help students understand the basic structure of blockchain and why it can be considered as decentralized 
   systems.More specifically, the web application should offer several efficient functions of query and storing information that include user’s data and blocked data. 

   Developing such web applications and having hands-on practice in such an environment should stimulate students’ interests of learning and exploring fundamentals of blockchain
   technology, especially for future CS undergrad students who are interested in blockchain-related studies. 

## Risk analysis
   1. **Technology Unfamiliar:** None of our team members get touch with blockchain technology before, and even its related technologies. Especially, the current blockchain technology
      contains substantial brand new knowledge, so it takes time to absorb all those information in the short time frames. The possible solution is to narrow down our view because
      it can help us to select an easy understandable area to develop with. 

   2. **Database Storage Limit:** Due to 10,000 table limits for free trial databases service in the AWS server, we can not store a lot of blocks and each block stores a bunch of
      transactions like in the real world. We have to minimize the block size including the numbers of transactions inside it and the constraint period of creating new blocks. 
      Alternatively, we will take a shot on creating a intranet based web server to eliminate the storage limitation.

   3. **Achievement/Requirement Adjust:** Since the project itself includes too many requirements to be achieved, 4 members team don’t have abundant abilities to accomplish all of
      those functionalities of the client’s requirement. Hence, it might be failed to satisfy the client's goal. To overcome this, our team members need to at least categorize 
      the hierarchy of requirements, adjust the requirements, and choose the most urgent one. And also animating some functionality instead of simulation due to technical constraints. 

   4. **Framework Unfamiliar:** Only one of our team members has used spring boot before, other team members have to learn from the beginning to understand the structure and be able
      to implement the code all together. Watch YouTube Tutorial Videos or Read Blog Instructions for Spring boot and discuss the difficulties during each week meeting is one of
      the solutions to it. 

   5. **Team Disagreement:** everyone in the team has her/his language preference on constructing database and server, so coordinating this balance is hard to finish. As a result, 
      making slight chances on each one’s preference. In other words, instead of relying on preference, it’s better to select a language which every team member knows.

   6. **Resources limits:** Blockchain technology and cryptocurrency are new and hot topics in current eve. We don’t have a lot of reliable and authoritative academic papers to 
      read and research. Explore the journals in well-known websites such as ACM, Academic Search Complete, Nexis Uni and etc. will be a solution to it.
      
## Work breakdown structure (WBS) 

tasks breakdown for the UNO EDU web application:

| Tasks      | Mission          |
| ------------- |:-------------:|
| **Task 1 (09/28):**     | Set up the user login & register pages |
| **Task 2(M1 10/06):**     | Connect with the backend and work on user authentication      | 
| **Task 3(10/16):** | Add functionalities of virtual wallet     | 
| **Task 4(M2 10/22):**     |  Work on Add functionalities of virtual wallet  |
| **Task 5 (11/03):**    |  Implementation of the transaction history page.     | 
| **Task 6(M3 11/10):** |  Work on adding functionality of block explorer    | 
| **Task 7 (11/17):**    |   Generation of animation pages     | 
| **Task 8(M4 11/24):** |  Re-evaluate the pages and their relationship with one another and give a quick demo of the web application    | 
| **Task 10 (12/01):**  |   Testing and fix bugs  |
| **Task 11(M5 12/10):** |   Complete-demo of our web application  | 
 
 

At the begining, we need to configure several servers and platforms to assist the construction of the fundamental frame. Using the software engineering class as an example, 
we want to start a server with AWS and install an operating system in it to facilitate and transmit ciphertexts and plaintexts between different devices.

Next, we want to activate a web based user interface which can achieve the symmetric interactions between the server and client. In this phase, we might need to consider 
using some techniques of security talk protocols like TCP handshake. 

When the basic structure has been formed, our team will work on separate missions according to assigned members roles. More precisely, filling functionality into the 
system like users authentication, transaction history, mining exhibition and graph analysis, etc.

Continuously, as we know, a complete program is not just in technical parts like code reviewing, so improving and enhancing the architectural risk analysis is also 
considerable. Therefore, solidifying systems elements ought to be done through the system-of-interest. 

Finally, wrapping up everything we have to get ready for Demo and Presentation. We still need to maintain the systems functionality while we have done the final show 
because it guarantees the security engineering effort.


## Project schedule

| Milestone #     |  Description     |  Code Implementation  |
| -------------  |:-------------:| ------------- |
|  Milestone 1     | Set up a server in AWS, install os and mysql on the server. Connect client requirements to list of functions  | Code implementation: User authentication function,  Block function, Hash function |
|  Milestone 2     | Code implementation for backend. Determine the architect and design of the application  |  Virtual wallet function, Transaction poll function, Mining reward function  |   |
|  Milestone 3     | The prototype of application and improve frontend. This will also include visual data. Function descriptions for the application. Academic journal about blockchain tech  |   |
|  Milestone 4     | Application documentation and graph analysis. Identify local and community impact. Check if application meet client requirements  |    |
|  Milestone 5     | Application testing and debugging. Markdown documentation in the rest of time. Video demo. Adding appendices and references below the project |    |


## Monitoring and reporting mechanisms 

   Our team uses Trello to distribute project tasks and keep track of project progress. We meet at least three times per week: Tues/Thurs during class time and Wednesday 4pm. 
   Zexi, as a client liaison, would contact our client at most twice a week through e-mail or zoom meeting if necessary. We also use Groupme instead of email to improve the 
   connection between teammates. Our shared folder we would upload all of the essential materials during our project, including group exercises, academic journal or related paper,
   presentation, meeting notes document. 

## Working Links
   [Project tracking system](https://trello.com/b/yogrmwgA/capstone-4970)  
   [Git code repository](https://github.com/fire-holder)  
   [Shared folder for project documents](https://drive.google.com/drive/folders/1GIe_s5PCKDS4bCvI0PKnX3wvufBDZ1ly?usp=sharing)  



