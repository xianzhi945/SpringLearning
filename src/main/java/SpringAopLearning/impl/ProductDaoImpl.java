package SpringAopLearning.impl;

import SpringAopLearning.ProductDao;
import org.springframework.stereotype.Service;

@Service("productDao")
public class ProductDaoImpl implements ProductDao {
    public void save() {
        System.out.println("保存商品");
    }

    public void update() {
        System.out.println("更新商品");
    }

    public String delete() {
        System.out.println("删除商品");
        return "123";
    }

    public void find() {
        System.out.println("查找商品");
        int i=1/0;
    }
}
