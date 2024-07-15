<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <% if(session.getAttribute("username") == null)
    {
        response.sendRedirect("login.jsp");
    }

    %>

    <div>
        <div>
            <h1>Yash Thakur</h1>
            <p>contact: 
            <a href="mailto:tyash6843@gmail.com">tyash6843@gmail.com</a>
            </p>

            <p>LinkedIn: 
            <a href="https://www.linkedin.com/in/yashthakur16/">linkedin.com/yashthakur16</a>
            </p>
    
            <p>Github: 
            <a href="https://github.com/yashthakur16">github.com/yashthakur16</a>
            </p>
        </div>

        <div>
            <table>
                <tr>
                    <td><img src="yash.jpeg" alt="Yash Thakur" height="120px" width="120px"></td>
                    <td>Aspiring software engineer with a passion for problem-solving and a strong foundation in Data Structures and Algorithms (DSA).
                        Currently focused on honing development skills while actively participating in learning opportunities. Eager to leverage my expertise
                        to contribute to the innovative projects of a leading tech company. Winner of the prestigious inter-college coding competition
                        organized by ITSA Club, showcasing my commitment to excellence in programming. Seeking a challenging role where I can apply
                        my skills, drive for continuous improvement, and contribute to the success and growth of a dynamic organization in the tech industry.</td>
                </tr>
            </table>
        </div>

        <section>
            <h3>Education</h3>
            <ul>
                <li>B.E. - Artificial Intelligence & Data Science, Dr. D. Y. Patil Institute of Technology</li>
                <li>12th | Maharashtra state board,DNYAN BHARTI'S Sau. S.R.Karandikar Senior College of Commerce & Late M.B.B. Irani College of Arts &
                    BSES Junior College of Science., Dahanus</li>
            </ul>
        </section>

       <div>
        <section>
            <h2>Work Experience</h2>
            <h3>Technical head,DSAII Club</h3>
            <p>August 2023 - August 2024</p>
    
            <ul>
                <li>Collaborated with the club's leadership team to organize and promote events related to data science and artificial intelligence.</li>
                <li>Assisted in planning and executing workshops, seminars, and competitions to enhance members' knowledge and skills.</li>
                <li>Facilitated communication and coordination among club members, fostering a collaborative learning environment.</li>
            </ul>
    
        </section>
       
        <section>
            <h3>Volunteer, DEBSOC Club  </h3>
            <p>August 2023 - August 2024</p>
    
            <ul>
                <li>Volunteered in organizing and assisting with the logistics of DEBSOC Event.</li>
                <li>Collaborated with a team to ensure the event ran smoothly and efficiently.</li>
                <li>Contributed to event coordination and execution.</li>
            </ul>            
        </section>
        
       </div>
       

       <div>
            <h2>Skills</h2>

            <ul>
                <li>cpp</li>
                <li>java</li>
                <li>DSA</li>
                <li>OOPS</li>
                <li>HTML</li>
            </ul>
       </div>
        
       <div>
            <h2>Achievements</h2>
            <ul>
                <li>Secured Rank 1 in coding competition held by ITSA club</li>
            </ul>
       </div>
       
       <div>
        <section>
            <h2>Projects</h2>
            <h3>Watch Trailers (Web Application) </h3>
            <ul>
                <li>Designed and built a web application that allows users to watch trailers of upcoming movies</li>
                <li>Developed a responsive and user-friendly interface using HTML, CSS, and JavaScript for dynamic interactions</li>
                <li>Github: <a href="https://github.com/yashthakur16/Watch-Trailer-">Watch Trailers</a></li>
            </ul>
        </section>

        <section>
            <h3>Lexilingo</h3>
            <ul>
                <li>LexiLingo is a web-based Natural Language Processing (NLP) toolkit built using Flask, HTML, and CSS.</li>
                <li>It provides an intuitive interface for a variety of text processing features, including language translation and detection, POS tagging and NER recognition,text summarization, and sentiment analysis.</li>
                <li>Github: <a href="https://github.com/yashthakur16/LexiLingo">Lexilingo</a></li>
            </ul>
        </section>

        <section>
            <h3>Pulse-AI</h3>
            <ul>
                <li>Initiated the development of a virtual assistant with natural language processing and voice recognition capabilities.</li>
                <li>Utilized Python for NLP functionalities.</li>
                <li>Github: <a href="https://github.com/yashthakur16/Pulse-AI">Pulse-AI</a></li>
            </ul>
        </section>
            
       </div>
       
       <section>
        <h3>Frequently asked questions</h3>
        <details>
            <summary>What is your Name?</summary>
            <p>Yash Thakur</p>
        </details>
        <details>
            <summary>What is your Graduation year?</summary>
            <p>2025</p>
        </details>
        <details>
            <summary>Your Branch?</summary>
            <p>Artificial Intelligence & Data Science</p>
        </details>
       </section>

        <footer>
            &copy;2024,Yash Thakur. All rights reserved
        </footer>

    </div>
</body>
</html>