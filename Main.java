import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Här skapar jag mina produkter från min Product-klass
        Product mask = new Product("Mask", 235.50, 14);
        Product plasticKnife = new Product("Plastic knife", 45.50, 3);
        Discount fakeBlood = new Discount("Fake Blood", 95.5, 44, 0.5);


        // Skapar en kund från min Customer-klass så jag kan samla totalbelopp och antal varor
        Customer oliver = new Customer(0, 0);


        // Loop för att göra mer än ett köp (break vid val av "4. Quit")
        while(true) {

            // Presenterar produktinfo till användare, här visar jag både det rabatterade priset och det vanliga på "fake blood"
        System.out.println("1. " +mask.getName()+ ", " +mask.getPrice() + ", " +mask.getQuantity() + " st in stock." );
        System.out.println("2. " +plasticKnife.getName()+ ", " +plasticKnife.getPrice()+ ", " +plasticKnife.getQuantity() + " st in stock." );
        System.out.println("3. " +fakeBlood.getName()+ ", " +fakeBlood.getDiscountPrice() + ", " +fakeBlood.getQuantity() + " st in stock. (ON SALE, old price: " + fakeBlood.getPrice() + ")" );
        System.out.println("4. Quit.");

        // Tar in användarens val, köp av vara 1, 2, 3 eller 4 för quit
        System.out.println("Choose your option: ");
        int Scanner = scanner.nextInt();


        if ( Scanner == 1 ) {

            // if-sats för att bara lägga till pris/ta bort från stock om där är mer än 0 i stocken av produkten, else för att berätta att den är slut
            if ( mask.getQuantity() > 0) {

                mask.quanLeft(1);

                oliver.totalPrice(mask.getPrice());

            }else {
                System.out.println("THE MASK IS OUT OF STOCK");
            }


        } else if ( Scanner == 2 ) {

            if ( plasticKnife.getQuantity() > 0 ) {

                plasticKnife.quanLeft(1);

                oliver.totalPrice(plasticKnife.getPrice());

            }else {
                System.out.println("THE PLASTIC KNIFES IS OUT OF STOCK");
            }


        } else if ( Scanner == 3 ) {

            if ( fakeBlood.getQuantity() > 0 ) {

                fakeBlood.quanLeft(1);

                oliver.totalPrice(fakeBlood.getDiscountPrice());

            } else {
                System.out.println("THE FAKE BLOOD IS OUT OF STOCK");
            }

        } else if ( Scanner == 4 ) {

            System.out.println("You purchased a total of " + oliver.getTotalProducts() + " products for a total of " + oliver.getPrice() + " SEK.");

            break;

        }

        }
    }
}