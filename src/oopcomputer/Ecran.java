/*
 * Ecranul calculatorului
 */
package oopcomputer;

/**
 *
 * @author Mike
 */
class Ecran {

    public Ecran(Carcasa nouaStapana) {
        this.stapana = nouaStapana;
    }
    private String afisaj = "0";
    private Carcasa stapana;

    public String getAfisaj() {
        return afisaj;
    }

    public void setAfisaj(String afisaj) {

        switch (afisaj) {
            case "+":
                operatiuneLocala('+');
                break;
            case "-":
                operatiuneLocala('-');
                break;
            case "*":
                operatiuneLocala('*');
                break;
            case "/":
                operatiuneLocala('/');
                break;
            case "=":
                stapana.getAlu().setOperandDoi(Integer.parseInt(this.afisaj));
                stapana.getAlu().calculeaza();
                System.out.println("Ecranul afiseaza: " + stapana.getAlu().getRezultat());
                break;
            default:
                if (this.stapana.getAlu().getOperator() == ' ') {
                    if ("0" == this.afisaj) {

                        this.afisaj = "";
                    }
                    this.afisaj += afisaj;
                    System.out.println("Ecranul afiseaza: " + this.afisaj);

                } else {
                    if (Integer.parseInt(this.afisaj) == stapana.getAlu().getOperandUnu()) {
                        this.afisaj = "";
                        this.afisaj = this.afisaj + afisaj;
                    } else {
                        this.afisaj += afisaj;
                    }

                    System.out.println("Ecranul afiseaza: " + this.afisaj);
                }

        }

    }

    /**
     * Computation
     */
    private void operatiuneLocala(char c) {

        stapana.getAlu().setOperandUnu(Integer.parseInt(afisaj));
        stapana.getAlu().setOperator(c);
        System.out.println("Ecranul afiseaza: " + this.afisaj);
    }
}