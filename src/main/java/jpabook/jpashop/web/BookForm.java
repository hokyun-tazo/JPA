package jpabook.jpashop.web;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter@Setter
public class BookForm {
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;
    private String author;
    private String isbn;
}
