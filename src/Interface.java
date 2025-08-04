import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.Objects;

//This class is responsible for the calculation of the program
class CalcIMC {
    protected double altura;
    protected double peso;

    public double Calc(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
        double result;

        result = peso / (altura * altura);
        return result;
    }

}


public class Interface extends Application {
    @Override
    public void start(Stage stage){

        //Here will be created the objects of the program at the graphic interface
        Label label = new Label("Calculadora IMC:");
        label.getStyleClass().add("title");
        label.setAlignment(Pos.CENTER);

        Text weight = new Text("Peso: ");
        weight.getStyleClass().add("parameter");

        Text wValue = new Text(" (Kg)");
        wValue.getStyleClass().add("parameter");

        Text height = new Text("Altura: ");
        height.getStyleClass().add("parameter");

        Text hValue = new Text(" (M)");
        hValue.getStyleClass().add("parameter");

        TextField insertW = new TextField();
        insertW.setPromptText("Exemplo: 60");
        insertW.getStyleClass().add("txField");

        TextField insertH = new TextField();
        insertH.setPromptText("Exemplo: 1.79");
        insertH.getStyleClass().add("txField");

        Button button = new Button("Calcular IMC");
        button.getStyleClass().add("btn");

        Label result = new Label("Resultado!");
        result.getStyleClass().add("result");
        result.setAlignment(Pos.CENTER);

        //Definition of how the elements are arranged on the screen
        GridPane gridPane = new GridPane();
        gridPane.getStyleClass().add("bkg");
        GridPane.setHalignment(label, HPos.CENTER);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(3);

        gridPane.add(label, 0, 0,3,1);
        gridPane.addRow(1, weight, insertW, wValue);
        gridPane.addRow(2, height, insertH, hValue);
        gridPane.add(button,1,3);
        gridPane.add(result, 0, 4,3,1);

        //In this sector is located the entire structure that will capture the inputs written by the user and then the calculation will be made
        button.setOnAction(_ ->{
            try{

                double getWeight = Double.parseDouble(insertW.getText());
                double getHeight = Double.parseDouble(insertH.getText());
                CalcIMC calc = new CalcIMC();
                double imc = calc.Calc(getHeight,getWeight);

                String classificationIMC = Classification(imc);
                result.setText(String.format("Seu IMC é: %.2f - %s",imc,classificationIMC));

            }catch (NumberFormatException E) {
                result.setText("POR FAVOR INSIRA VALORES VÁLIDOS!");
            }
        });



        Scene scene = new Scene(gridPane, 400,400);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("resources/Styles/styles.css")).toExternalForm());
        stage.setTitle("Calculadora IMC");
        stage.setScene(scene);
        stage.show();
    }

    // To facilitate the reading of the code, the classification class was created, where are the descriptions of the IMC calculation results
    private String Classification(double imc){
        if (imc < 17) {
            return "Muito abaixo do peso";
        } else if (imc <= 18.49) {
            return "Abaixo do peso";
        } else if (imc <= 24.99) {
            return "Peso normal";
        } else if (imc <= 29.99) {
            return "Sobrepeso";
        } else if (imc <= 34.99) {
            return "Obesidade Grau I";
        } else if (imc <= 39.99 ) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III (mórbida)";
        }
    }

    public static void main(String[] args){
        //
        launch(args);
    }


}
