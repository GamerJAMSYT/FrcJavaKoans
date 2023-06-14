package koans.french;

public class AboutConditions {
    /**
     * Écrire une méthode 'sign' qui a un entier en paramètre, et retourne du texte:
     * 
     * - si le nombre est plus grand que ou égal à 0, retourne le texte "positif"
     * - sinon retourne le texte "négatif"
     * 
     * ---------   TIPS --------------
     * 
     * Tu peux exécuter du code sélectivement en fonction d'une condition. Une condition entre 2 nombre peut être exprimée ainsi:
     * 
     *     4 == 4
     *       ^
     *    égalité
     * 
     *     4 != 4
     *        ^
     *    inégalité (différent de)
     * 
     *     4 > 3
     *       ^
     *  plus grand que
     * 
     *     4 >= 3
     *       ^
     * plus grand que ou égal
     * 
     *     4 < 3
     *       ^
     *   plus petit que
     * 
     *     4 <= 3
     *       ^
     *  plus petit que ou égal
     * 
     * Pour utiliser une condition dans ton code, tu peux utiliser une instruction 'if / else'. Ex:
     * 
     *     if (number > 10) {
     *         // Code exécuté seulement si 'number' est plus grand que 10
     *     } else {
     *         // Code exécuté seulement si 'number' n'est pas plus grand que 10
     *     }
     * 
     * Note: les doubles barres obliques '//' permettent d'écrire un commentaire jusqu'à la fin de la ligne. Ex:
     * 
     *     String text = "Hello"; // Assigne la valeur "Hello" à la variable 'text'.
     * 
     * -------------------------------
     * 
     * Résultat attendu:
     * 
     * sign(2) devrait retourner "positive"
     * 
     */


    /**
     * Écrit une méthode 'signOrZero' qui a un entier en paramètre, et retourne du texte:
     * 
     * - si le nombre est plus grand que à 0, retourne le texte "positif"
     * - si le nombre est 0, retourne le text "zéro"
     * - sinon retourne le texte "négatif"
     * 
     * ---------   TIPS --------------
     * 
     * Pour enchaîner plusieurs conditions, tu peux utiliser l'instruction 'if / else if / else'. Ex:
     * 
     *     if (number > 10) {
     *         // Code exécuté seulement si 'number' est plus grand que 10
     *     } else if (number > 0) {
     *         // Code exécuté seulement si 'number' n'est pas plus grand que 10, mais est plus grand que 0
     *     } else {
     *         // Code exécuté seulement si 'number' n'est ni plus grand que 10, ni plus grand que 0
     *     }
     * 
     * Note: tu peux avoir un seul 'if' et un seul 'else', mais tu peux avoir plusieurs 'else if' dans une telle instruction.
     * 
     * -------------------------------
     * 
     * Résultat attendu:
     * 
     * signOrZero(2) devrait retourner "positif"
     * signOrZero(0) devrait retourner "zéro"
     * 
     */


    /**
     * Écrit une méthode 'gradeComment' qui a un paramètre entier représentant une note d'examen, et retourne du texte:
     * 
     * - si la note est moins que 0 ou plus grande que 100, retourne le texte "Tu triches!"
     * - si la note est 100, retourne le texte "Bravo, tu as tout bon!"
     * - si la note est 0, retourne le texte "Ouch!"
     * - si la note est plus grande que 0, mais moins grande que 60, retourne le texte "Échec!"
     * - sinon retourne le texte "Bravo, tu passes!"
     * 
     * ---------   TIPS --------------
     * 
     * Tu peux combiner plusieurs conditions ensemble en utilisant les opérateurs '&&' (ET) et '||' (OU). Ex:
     * 
     *     if ((4 > 3) && (3 > 4)) {
     *         // Le code ici ne sera jamais exécuté
     *     }
     *     if ((4 > 3) || (3 > 4)) {
     *         // Le code ici sera exécuté
     *     }
     * 
     * -------------------------------
     * 
     * Résultat attendu:
     * 
     * gradeComment(80) devrait retourner "Bravo, tu passes!"
     * gradeComment(0) devrait retourner "Ouch!"
     * 
     */    
}
