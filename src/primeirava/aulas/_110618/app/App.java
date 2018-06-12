package primeirava.aulas._110618.app;

import java.util.ArrayList;
import javax.swing.SwingUtilities;

import primeirava.aulas._110618.controller.ControllerTelasClinica;
import primeirava.aulas._110618.view.TelaAtendimento;
import primeirava.aulas._110618.view.TelaMedico;
import primeirava.aulas._110618.model.FichaAtendimento;

public class App{
    public static void main(String[] args) {
    	System.out.println("Observer");
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {                                       
            	String numeroFicha="0";
                FichaAtendimento model = new FichaAtendimento(0);
                ArrayList<TelaAtendimento> telasAtendimento = new ArrayList<TelaAtendimento>();
                TelaMedico telaMedico = new TelaMedico("Dr. Rico", numeroFicha);
                TelaAtendimento tela1 =new TelaAtendimento("Recepção1", numeroFicha);
                TelaAtendimento tela2 =new TelaAtendimento("Recepção2", numeroFicha);
                telasAtendimento.add(tela1);
                telasAtendimento.add(tela2);
                
                model.addObserver(telaMedico);                
                model.addObserver(tela1);
                model.addObserver(tela2);

                
                ControllerTelasClinica controller = new ControllerTelasClinica(model,telasAtendimento, telaMedico);
                controller.control();
            }
        });  
    }
}