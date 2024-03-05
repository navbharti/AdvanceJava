# Introduction to Markdown

- technology used to create a web application.
- an API that provides interfaces and classes.
- an interface that must be implemented for creating any Servlet.
- a class that extends the capabilities of the servers and responds to the incoming requests. It can respond to any requests.
- a web component deployed on the server to create a dynamic web page.

|![Concept of Client and Server](https://static.javatpoint.com/images/response.JPG)|
|:--:|
| ***Concept of Client and Server*** |

## Web application?
- An application accessible from the web. 
- A **web application** is composed of web components like **Servlet**, **JSP**, **Filter**, etc. and other elements such as **HTML**, **CSS**, and **JavaScript**. 
- The web components typically execute in Web Server and respond to the HTTP request.

## Servlet Container

|![Servlet Container States](https://static.javatpoint.com/servletpages/servletterminology/images/servlet-container1.png)|
|:--:|
| Concept of Client and Server |

### The Servlet Container performs many operations that are given below:

- Life Cycle Management
- Multithreaded support
- Object Pooling
- Security etc.


## Server: Web vs. Application

|![Web Server Working](https://static.javatpoint.com/servletpages/servletterminology/images/server-web-vs-application1.png)|
|:--:|
| Web Server Working |


|![Application Server Working](https://static.javatpoint.com/servletpages/servletterminology/images/server-web-vs-application2.png)|
|:--:|
| Application Server Working |

## Content Type
- supports the non-ASCII characters
- It supports the multiple attachments in a single message
- It supports the attachment which contains executable audio, images and video files etc.
- It supports the unlimited message length.

### List of Content Types
There are many content types. The commonly used content types are given below:

- text/html
- text/plain
- application/msword
- application/vnd.ms-excel
- application/jar
- application/pdf
- application/octet-stream
- application/x-zip
- images/jpeg
- images/png
- images/gif
- audio/mp3
- video/mp4
- video/quicktime etc.


## Interfaces in javax.servlet package
There are many interfaces in javax.servlet package. They are as follows:

- Servlet
- ServletRequest
- ServletResponse
- RequestDispatcher
- ServletConfig
- ServletContext
- SingleThreadModel
- Filter
- FilterConfig
- FilterChain
- ServletRequestListener
- ServletRequestAttributeListener
- ServletContextListener
- ServletContextAttributeListener


## Classes in javax.servlet package
There are many classes in javax.servlet package. They are as follows:

- GenericServlet
- ServletInputStream
- ServletOutputStream
- ServletRequestWrapper
- ServletResponseWrapper
- ServletRequestEvent
- ServletContextEvent
- ServletRequestAttributeEvent
- ServletContextAttributeEvent
- ServletException
- UnavailableException

## Interfaces in javax.servlet.http package
There are many interfaces in javax.servlet.http package. They are as follows:

- HttpServletRequest
- HttpServletResponse
- HttpSession
- HttpSessionListener
- HttpSessionAttributeListener
- HttpSessionBindingListener
- HttpSessionActivationListener
- HttpSessionContext (deprecated now)

## Classes in javax.servlet.http package
There are many classes in javax.servlet.http package. They are as follows:

- HttpServlet
- Cookie
- HttpServletRequestWrapper
- HttpServletResponseWrapper
- HttpSessionEvent
- HttpSessionBindingEvent
- HttpUtils (deprecated now)

## Servlet Interface and its methods
| Method |	Description |
|:__:|
| public void init(ServletConfig config)	| initializes the servlet. It is the life cycle method of servlet and invoked by the web container only once. |
| public void service(ServletRequest request,ServletResponse response) |	provides response for the incoming request. It is invoked at each request by the web container. |
| public void destroy()	| is invoked only once and indicates that servlet is being destroyed.|
| public ServletConfig getServletConfig()	| returns the object of ServletConfig.|
| public String getServletInfo()	| returns information about servlet such as writer, copyright, version etc.|

```java
import java.io.*;  
import javax.servlet.*;  
  
public class FirstServlet implements Servlet{  
	ServletConfig config=null;  
	  
	public void init(ServletConfig config){  
		this.config=config;  
		System.out.println("servlet is initialized");  
	}  
	  
	public void service(ServletRequest req,ServletResponse res)  
	throws IOException,ServletException{  
	  
		res.setContentType("text/html");  
		  
		PrintWriter out=res.getWriter();  
		out.print("<html><body>");  
		out.print("<b>hello simple servlet</b>");  
		out.print("</body></html>");  
	  
	}  
	public void destroy(){
		System.out.println("servlet is destroyed");
		}  
	public ServletConfig getServletConfig(){
		return config;
		}  
	public String getServletInfo(){
		return "copyright 2007-1010";
		}  
  
}  
```

|![Servlet Lifer Cycle methods](https://media.geeksforgeeks.org/wp-content/uploads/Life-Cycle-Of-Servlet.jpg)|
|:--:|
|Servlet Life Cycle|

|![Servlet Lifer Cycle](https://media.geeksforgeeks.org/wp-content/uploads/Life-Cycle-Methods-of-a-Servlet.jpg)|
|:--:|
|Servlet Life Cycle Methods|


Creating First Servlet Program
1. Create  Maven Project or Dyanamic Web Project in Eclipse
2. Configure Server Runtime environment library of Tomcat servler in newly created project.
3. Create Servlet Class by implementing `Servlet` Interface in `javax.servlet` package.
4. Implement all Unimplemeted methods in user defined Servlet Class.
5. Configure URL pattern mapping tags in `web.xml`.
6. Run the project using "Run on Server" option.


https://drive.google.com/uc?export=view&id=1Xk5wgJlBwXEwM5YSgfK74cVX35sDwyo3

|![Servlet Lifer Cycle](https://drive.google.com/uc?export=view&id=1Xk5wgJlBwXEwM5YSgfK74cVX35sDwyo3)|
|:--:|
|Servlet Life Cycle Methods|
