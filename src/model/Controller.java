package model;


public class Controller {

    private OrderList orderList = new OrderList();
    private ProductList productList = new ProductList();

    public OrderList getOrderList() {
        return orderList;
    }

    public void setOrderList(OrderList orderList) {
        this.orderList = orderList;
    }

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    public String getCategory() {
        return null;
    }

    public String searchProduct(int option, String data) {
        return null;
    }

    public String searchOrder(int option, String data) {
        return null;
    }
}