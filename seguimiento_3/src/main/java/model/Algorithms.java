package model;

import java.util.ArrayList;

public class Algorithms {

    public Algorithms() {}

    public ArrayList<Integer> repeatingValues(ArrayList<Integer> values) {

        ArrayList<Integer> repeated = new ArrayList<>(); // Se ejecuta una vez O(1).

        boolean flag = false; // Se ejecuta una vez O(1).


        // Peor caso: values = [1,1,2,2,3,3,4,4,5,5,6,6...]

        for (int i = 1; i < values.size(); i++) { // n = values.size() . Esta linea se repite n veces. O(n)

            int number = values.get(i); // Se ejecuta n - 1 veces. O(n)

            if (values.get(i - 1) != number) { // Se ejecuta n - 1  veces. O(n)

                flag = false;  // Para una lista con parejas de numeros repetidos , se repite aproximadamente n/2 veces. O(n)

            } else if (!flag) { //  Para una lista con parejas de numeros repetidos se ejecuta aproximadamente n/2 veces. O(n)

                repeated.add(number); // Si hay parejas de números iguales se repite aproximadamente n/2. O(n)

                flag = true;  // Se repite aproximadamente n/2.

            }
        }

        return repeated; // Se repite una vez O(1)

        /*
        Suma de las líneas: 1 + 1 + n + n - 1 + n - 1 + n/2 + n/2 + n/2 + n/2 + 1 = 3n + 2n + 1

        Conclusión: La complejidad del algoritmo es: 5n + 1
                    La cota superior es: O(n)
         */


    }


    public boolean  isPalindrome(String word) {

        int j = word.length() - 1; // O(1)

        for(int i = 0; i <= j; i++) {   // O(n)

            if( !String.valueOf(word.charAt(i)).equalsIgnoreCase(String.valueOf(word.charAt(j))) ) {  //O(n)
                return false;
            }

            j--;
        }
        return true;
    }



    public int numberOfBits1(String bitString) {

        int numberOfBits1 = 0;

        for(int i = 0; i < bitString.length(); i++) {
            if(bitString.charAt(i) == '1') {
                numberOfBits1++;
            }
        }

        return numberOfBits1;
    }


}
