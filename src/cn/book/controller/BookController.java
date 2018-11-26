package cn.book.controller;

import cn.book.pojo.Books;
import cn.book.service.BookService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.util.locale.provider.LocaleServiceProviderPool;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Auther:lenovo
 * @Date:2018/11/231453
 * @Description;
 */
@Controller
@RequestMapping("/book")
public class BookController {
    Logger logger=Logger.getLogger("");
    @Autowired
    private BookService bookService;

    @RequestMapping("/list.html")
    public String listBook(@RequestParam(required = false) String book, @RequestParam(required = false) String bookmo, Model model, HttpSession session){
        logger.debug("------------>listBook");
        if(session.getAttribute("mess")!=null){
            model.addAttribute("mess",session.getAttribute("mess"));
        }
        List<Books> booksList=new ArrayList<>();
        booksList=bookService.listBook(book,bookmo);
        logger.debug("------------>booksList"+booksList);
        model.addAttribute("list",booksList);
        return "index";
    }
    @RequestMapping("/insert.html")
    public String insert(Books books, HttpSession session){
        logger.debug("------------------>insert");
        books.setCreateDate(new Date());
        int re=bookService.bookSert(books);
        if(re>0){
            logger.debug("------------>新增成功");
            session.setAttribute("mess","新增成功");
            return "redirect:/book/list.html";
        }else {
            logger.debug("------------>新增失败");
            session.setAttribute("mess","新增失败");
        }
        return "";
    }

    @RequestMapping("/inn.html")
    public String inn(){
        return "insert";
    }
}
