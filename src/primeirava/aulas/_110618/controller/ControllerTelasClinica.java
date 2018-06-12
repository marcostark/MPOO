package primeirava.aulas._110618.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import primeirava.aulas._110618.view.TelaAtendimento;
import primeirava.aulas._110618.view.TelaMedico;
import primeirava.aulas._110618.model.FichaAtendimento;

public class ControllerTelasClinica implements ActionListener{

	private FichaAtendimento model;
    private ArrayList<TelaAtendimento> telasAtendimento;
    private TelaMedico telaMedico;
    
    public ControllerTelasClinica(FichaAtendimento model, 
    		ArrayList<TelaAtendimento> telasAtendimento, 
    		TelaMedico telaMedico){
        this.model = model;
        this.telasAtendimento = telasAtendimento;
        this.telaMedico= telaMedico;
    }
    
    public void control(){        
        telaMedico.getButton().addActionListener(this);
    }
    
    private void atualizarTelas(){
    	model.incX();
    	//a atualiza��o � disparada pelo Observ�vel!
//        telaMedico.setText(Integer.toString(model.getX()));
//        for (TelaAtendimento tela: telasAtendimento)
//        	tela.setText(Integer.toString(model.getX()));
    }    
    
	public void actionPerformed(ActionEvent e) {
		atualizarTelas();
	}
}