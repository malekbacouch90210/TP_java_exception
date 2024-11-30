package TP_exception_factoriel;

public class Factoriel {
    public static void main(String[] args) {
        int i, nbEntiers = 0, factorielle = 1;
        int ancien;

        try {
            nbEntiers = Integer.parseInt(args[0]);
            if (nbEntiers < 0) {
                throw new negatif();
            } else if (nbEntiers >= 20) {
                throw new Superier();
            } else {
                for (i = 2; i <= nbEntiers; i++) {
                    ancien = factorielle;
                    factorielle *= i;
                }
                System.out.println("Voilà la factorielle des " + nbEntiers + " premiers entiers : " + factorielle);
            }
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Error:");
        } catch (NumberFormatException e2) {
            System.out.println("Error: Not entier");
        } catch (negatif e3) {
            System.out.println("Error: entier négatif !!!");
        } catch (Superier e4) {
            System.out.println("Error: Supérieur à 20 !!!!!");
        }
    }
}
	