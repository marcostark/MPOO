package segundava.exercicios.manipulandoxml;

import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class PessoaDAO {
	
	public static boolean adicionarPessoa(Pessoa pessoa) {
		XStream stream = new XStream(new DomDriver());
		stream.autodetectAnnotations(true);
		String xml = stream.toXML(pessoa);
		System.out.println("XML = ");
		System.out.println(xml);
		return true;
		
	}
	
	public static List<Pessoa> pessoas (){
		
		
		return null;
	}

}
