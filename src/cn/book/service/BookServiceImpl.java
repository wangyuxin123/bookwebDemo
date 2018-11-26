package cn.book.service;

import cn.book.dao.BookMapper;
import cn.book.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:lenovo
 * @Date:2018/11/231456
 * @Description;
 */
@Service
public class BookServiceImpl  implements BookService{
    @Autowired
    private BookMapper bookMapper;
    /**
     * 查询book返回一个list集合
     *
     * @param name
     * @param name2
     * @return
     */
    @Override
    public List<Books> listBook(String name, String name2) {
        return bookMapper.listBook(name,name2);
    }

    /**
     * 新增方法
     *
     * @param books
     * @return
     */
    @Override
    public int bookSert(Books books) {
        return bookMapper.bookSert(books);
    }
}
