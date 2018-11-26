package cn.book.service;

import cn.book.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther:lenovo
 * @Date:2018/11/231456
 * @Description;
 */
public interface BookService {
    /**
     * 查询book返回一个list集合
     * @param name
     * @param name2
     * @return
     */
    List<Books> listBook(@Param("name") String name, @Param("name2") String name2);
    /**
     * 新增方法
     * @param books
     * @return
     */
    int bookSert(Books books);
}
