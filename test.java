public class test {
    public static void main(String[] args) {
      /* System.out.println("Hello World !"); */

      int milk = 10;
      int cereal = 10;
      int bol;

      if (milk == 0 || cereal == 0) {
        System.out.println("Je ne peux pas prendre mon petit déj");

      } else {

        System.out.println("Je peux prendre mon petit déj");
        bol = milk + cereal;
        System.out.println("Mon petit déj est prêt avec " + bol + " dans le bol");
      }

    }
  }