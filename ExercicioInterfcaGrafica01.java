
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



/**
 *
 * @author Patrick
 */
public class ExercicioInterfcaGrafica01 {
    
    private JFrame jFrame;
    private JLabel jLabelNome, jLabelIdade, jLabelRaca, jLabelApelido, jLabelPreco, jLabelDescricao;
    private JTextField jTextFieldNome, jTextFieldIdade, jTextFieldApelido, jTextFieldPreco, jTextFieldDescricao;
    private JComboBox jComboBoxRaca;
    private JRadioButton jRadioButtonVivo, jRadioButtonMorto, jRadioButtonRacao, jRadioButtonAlimentacao;
    private JCheckBox jCheckBoxAdestrado, jCheckBoxCastrado, jCheckBoxVacinado, jCheckBoxTemPedrigree;
    private DefaultComboBoxModel jComboBoxModelRaca;
    private JButton jButtonSalvar, jButtonCancelar;
    
    public ExercicioInterfcaGrafica01(){
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        definirObjetoComboBox();
        jFrame.setVisible(true);
    }
    
    private void gerarTela(){
        jFrame = new JFrame();
        jFrame.setSize(616, 422);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    private void adicionarComponentes(){
        jFrame.add(jLabelNome);
        jFrame.add(jTextFieldNome);
        jFrame.add(jLabelIdade);
        jFrame.add(jTextFieldIdade);
        jFrame.add(jLabelRaca);
        jFrame.add(jComboBoxRaca);
        jFrame.add(jLabelApelido);
        jFrame.add(jTextFieldApelido);
        jFrame.add(jLabelPreco);
        jFrame.add(jTextFieldPreco);
        jFrame.add(jRadioButtonVivo);
        jFrame.add(jRadioButtonMorto);
        jFrame.add(jRadioButtonRacao);
        jFrame.add(jRadioButtonAlimentacao);
        jFrame.add(jCheckBoxAdestrado);
        jFrame.add(jCheckBoxCastrado);
        jFrame.add(jCheckBoxVacinado);
        jFrame.add(jCheckBoxTemPedrigree);
        jFrame.add(jLabelDescricao);
        jFrame.add(jTextFieldDescricao);
        jFrame.add(jButtonSalvar);
        jFrame.add(jButtonCancelar);
        
        
    }
    
    private void instanciarComponentes(){
        jLabelNome = new JLabel("Nome");
        jTextFieldNome = new JTextField();
        jLabelIdade = new JLabel("Idade");
        jTextFieldIdade = new JTextField();
        jLabelRaca = new JLabel("Raça");
        jComboBoxRaca = new JComboBox();
        jLabelApelido = new JLabel("Apelido");
        jTextFieldApelido = new JTextField();
        jLabelPreco = new JLabel("Preço");
        jTextFieldPreco = new JTextField();
        jRadioButtonVivo = new JRadioButton();
        jRadioButtonVivo.setText("Vivo");
        jRadioButtonMorto = new JRadioButton();
        jRadioButtonMorto.setText("Morto");;
        jRadioButtonRacao = new JRadioButton();
        jRadioButtonRacao.setText("Ração");
        jRadioButtonAlimentacao = new JRadioButton();
        jRadioButtonAlimentacao.setText("Come almoços, jantas");
        jCheckBoxAdestrado = new JCheckBox("Adestrado");
        jCheckBoxCastrado = new JCheckBox("Castrado");
        jCheckBoxVacinado = new JCheckBox("Vacinado");
        jCheckBoxTemPedrigree = new JCheckBox("Tem Pedrigree");
        jLabelDescricao = new JLabel("Descrição");
        jTextFieldDescricao = new JTextField();
        jButtonSalvar = new JButton("Salvar");
        jButtonCancelar = new JButton("Cancelar");
        
    }
    
    private void gerarLocalizacoes() {
        jLabelNome.setLocation(10, 10);
        jTextFieldNome.setLocation(10, 35);
        jLabelIdade.setLocation(395, 10);
        jTextFieldIdade.setLocation(395, 35);
        jLabelRaca.setLocation(10, 70 );
        jComboBoxRaca.setLocation(10, 100);
        jLabelApelido.setLocation(190, 70);
        jTextFieldApelido.setLocation(190, 100);
        jLabelPreco.setLocation(395, 70);
        jTextFieldPreco.setLocation(395, 100);
        jRadioButtonVivo.setLocation(5, 136);
        jRadioButtonMorto.setLocation(5, 162);
        jRadioButtonRacao.setLocation(105, 136);
        jRadioButtonAlimentacao.setLocation(105, 162);
        jCheckBoxAdestrado.setLocation(315, 136);
        jCheckBoxCastrado.setLocation(315, 162);
        jCheckBoxVacinado.setLocation(435, 136);
        jCheckBoxTemPedrigree.setLocation(435, 162);
        jLabelDescricao.setLocation(10, 190);
        jTextFieldDescricao.setLocation(10, 217);
        jButtonSalvar.setLocation(315, 237);
        jButtonCancelar.setLocation(325, 237);
    }
    
    private void gerarDimensoes() {
        jLabelNome.setSize(70, 21);
        jTextFieldNome.setSize(342, 21);
        jLabelIdade.setSize(70, 21);
        jTextFieldIdade.setSize(194, 21);
        jLabelRaca.setSize(70, 21);
        jComboBoxRaca.setSize(147, 21);
        jLabelApelido.setSize(70, 21);
        jTextFieldApelido.setSize(162, 21);
        jLabelPreco.setSize(70, 21);
        jTextFieldPreco.setSize(194, 21);
        jRadioButtonVivo.setSize(100, 20);
        jRadioButtonMorto.setSize(100, 20);
        jRadioButtonRacao.setSize(100, 20);
        jRadioButtonAlimentacao.setSize(160, 20);
        jCheckBoxAdestrado.setSize(100, 20);
        jCheckBoxCastrado.setSize(100, 20);
        jCheckBoxVacinado.setSize(100, 20);
        jCheckBoxTemPedrigree.setSize(110, 20);
        jLabelDescricao.setSize(70, 21);
        jTextFieldDescricao.setSize(585, 85);
        jButtonSalvar.setSize(130, 65);
        jButtonCancelar.setSize(130, 65);
    }
    
    private void definirObjetoComboBox(){
        
        DefaultComboBoxModel jComboBoxModelRaca = new DefaultComboBoxModel(new Object[]{
            "Pastor alemão", "Buldogue", "Poodle", "Beagle", "Chihuahua", "Pug", "Boxer", "Husky"
                , "Dogue Alemão", "Pit bull"
        });
        jComboBoxRaca.setModel(jComboBoxModelRaca);
        jComboBoxRaca.setSelectedIndex(-1);
    }
    
}
