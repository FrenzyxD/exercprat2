import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JPanel {

    private GridLayout gridLayout;
    private Container container;
    private JTextField textField;
    private JButton [] line1 = new JButton [7];
    private JButton [] line2 = new JButton [7];
    private JButton [] line3 = new JButton [7];
    private JButton [] line4 = new JButton [7];
    private double resultado = 0;
    private String operador = "=";
    private boolean parenteses = false;

    private String [] line_s1 = {"X!", "e^x", "raiz 2", "7", "8", "9", "/"};
    private String [] line_s2 = {"raiz 3", "%", "x²", "4", "5", "6" , "*"};
    private String [] line_s3 = {"x³", "x^y", "pi", "1", "2", "3" , "-"};
    private String [] line_s4 = {"C", "(", ")", "0", ".", "=","+"};

    public Calculator() {
//        setLayout(new BorderLayout());
//        JPanel panel = new JPanel();
//        panel.setLayout(new GridLayout(4, 7));

        for(int i= 0; i < line1.length; i++) {
            line1[i].setText(line_s1[i]);
            line2[i].setText(line_s2[i]);
            line3[i].setText(line_s3[i]);
            line4[i].setText(line_s4[i]);
        }
    }

    public void Soma(double a,double b){
        this.resultado = a+b;
    }

    public void Subtracao(double a,double b){
        this.resultado = a-b;
    }

    public void Divisao(double a,double b){
        this.resultado = a/b;
    }

    public void Multiplicacao(double a,double b){
        this.resultado = a*b;
    }

    public void Fatorial(double x) {
        for (double i = x; i < 1; i--) {
            this.resultado *= i;
        }
    }

    public void Neperiano(double x) {
        double result = 2.71;
        if(x == 0) {
            result = 1;
        }
        else if(x > 0) {
            for (int i = 1; i < x; i++) {
                result *= result;
            }
        }
        else{
            for (double i = -1; i < x; i--) {
                result *= 1/result;
            }
        }
        this.resultado = result;
    }

    public void Raiz2(double x) {
        this.resultado = Math.sqrt(x);
    }

    public void Raiz3(double x) {
        this.resultado = Math.cbrt(x);
    }

    public void Porcentagem(double a,double b) {
        this.resultado = a*b/100;
    }

    public void Quadrado(double a) {
        this.resultado = a * a ;
    }

    public void Cubo(double a) {
        this.resultado = a * a * a;
    }

    public void Exponencial(double a,double b) {
        this.resultado = Math.pow(a, b);
    }

    public void PI() {
        this.resultado = 3.14;
    }

    public void Clear() {
        textField.setText("");
    }

    public void Parenteses() {
        this.parenteses = true;
    }

    public double Igual(){
        return this.resultado;
    }

    public static void main(String[] args) {

    }
}
