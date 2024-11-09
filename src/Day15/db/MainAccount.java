package Day15.db;


import Day15.db.service.AccountService;
import Day15.db.service.ProductService;

public class MainAccount {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        ProductService productService = new ProductService();

        // By Pass Login - Kiểm thử, skip cái phần login
//        boolean isLogged = accountService.accountFunction();
        boolean isLogged = true;
        System.out.println("isLogged: " + isLogged);

        if(isLogged){
            productService.productFunction();
        }

    }


}
