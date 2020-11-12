
public class TestStock {
    public static void main(String[] args) {
        Stock lsc = new Stock("LKSS","Limerick Software Solutions");
        System.out.printf("Stock %s changed by %.2f%%\n",lsc.name,lsc.getChangePercent());
    }
}
