package quadroAcidente;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
	Scanner sc = new Scanner(System.in);

//	int contagemInicial = 518;
	int contagemInicial = 656;

	int dia_referencia = 0;
	long days;
	

	private JPanel contentPane;
	private JLabel lbl_contagem;
	private JLabel txt_data;
	private JLabel txtDia;
	private JLabel txtAcidentes;
	private JLabel lblNewLabel_2;

	Date data = new Date();
	private JLabel lblNewLabel_3;

	static TelaPrincipal frame;
	private JTextField txt_dias_decorrente;
	private JTextField txt_dias_inicio;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField txtComeco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new TelaPrincipal();
					frame.setVisible(true);
					frame.setResizable(false);
					// frame.setTitle("Monitoramento de dias de acidente");
					frame.setLocale(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the frame.
	 */
	
	public TelaPrincipal() {
		setFont(new Font("Dialog", Font.PLAIN, 17));

		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\vigjo\\Downloads\\logo.png"));
		setTitle("MONITORAMENTO DE ACIDENTES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 420);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setFocusableWindowState(true);

		JLabel lblNewLabel = new JLabel("QUADRO DE ACIDENTE ATUALIZADO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(210, 11, 342, 35);
		contentPane.add(lblNewLabel);

		lbl_contagem = new JLabel("0000");
		lbl_contagem.setEnabled(false);
		lbl_contagem.setBackground(new Color(255, 0, 0));
		lbl_contagem.setForeground(Color.BLACK);
		lbl_contagem.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lbl_contagem.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_contagem.setBounds(239, 57, 155, 59);
		contentPane.add(lbl_contagem);

		txt_data = new JLabel("00:00:00  00/00/0000");
		txt_data.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txt_data.setHorizontalAlignment(SwingConstants.CENTER);
		txt_data.setBounds(195, 335, 305, 35);
		contentPane.add(txt_data);

		txtDia = new JLabel("DIAS");
		txtDia.setHorizontalAlignment(SwingConstants.CENTER);
		txtDia.setFont(new Font("Tahoma", Font.PLAIN, 35));
		txtDia.setBounds(400, 78, 86, 37);
		contentPane.add(txtDia);

		txtAcidentes = new JLabel("S/ ACIDENTES");
		txtAcidentes.setHorizontalAlignment(SwingConstants.CENTER);
		txtAcidentes.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtAcidentes.setBounds(498, 80, 201, 37);
		contentPane.add(txtAcidentes);

		lblNewLabel_2 = new JLabel("ESTAMOS H\u00C1");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_2.setBounds(20, 78, 209, 37);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_1 = new JLabel("Vers\u00E3o: 1.0");
		lblNewLabel_1.setBounds(33, 367, 66, 14);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_3 = new JLabel("By Jo\u00E3o Paulo de Oliveira");
		lblNewLabel_3.setBackground(Color.RED);
		lblNewLabel_3.setBounds(562, 367, 165, 14);
		contentPane.add(lblNewLabel_3);
		
		txt_dias_decorrente = new JTextField();
		txt_dias_decorrente.setEditable(false);
		txt_dias_decorrente.setHorizontalAlignment(SwingConstants.CENTER);
		txt_dias_decorrente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_dias_decorrente.setBounds(361, 271, 45, 29);
		contentPane.add(txt_dias_decorrente);
		txt_dias_decorrente.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("DIAS DE IN\u00CDCIO AT\u00C9 DATA ATUAL");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(20, 268, 317, 35);
		contentPane.add(lblNewLabel_4);
		
		txt_dias_inicio = new JTextField();
		txt_dias_inicio.setEditable(false);
		txt_dias_inicio.setHorizontalAlignment(SwingConstants.CENTER);
		txt_dias_inicio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_dias_inicio.setBounds(361, 227, 45, 29);
		contentPane.add(txt_dias_inicio);
		txt_dias_inicio.setColumns(10);
		
		lblNewLabel_5 = new JLabel("CONTAGEM IN\u00CDCIAL A CONTAR  DE");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(20, 233, 331, 24);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("DATA IN\u00CDCIO");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(20, 193, 131, 29);
		contentPane.add(lblNewLabel_6);
		
		txtComeco = new JTextField();
		txtComeco.setEditable(false);
		txtComeco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtComeco.setHorizontalAlignment(SwingConstants.CENTER);
		txtComeco.setBounds(148, 193, 125, 29);
		contentPane.add(txtComeco);
		txtComeco.setColumns(10);

		hoje();

	}

	public void hoje() {
		LocalDate dataInicio = null, hoje, dia, mes,ano;
		String teste;
		
		// pega dia atual e anterior
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		hoje = LocalDate.now();
		
		Date hj = new Date();
		
		
		Locale.setDefault(new Locale("pt","Brazil"));
		
		String hojeFormatado = DateFormat.getInstance().format(hj);
		String hojeFormatado2 = DateFormat.getInstance().format(hj);
		System.out.println("hoje formatado2 " + hojeFormatado);
		
		System.out.println();
		
		hojeFormatado2 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(hj);
		System.out.println("hoje formatado10 " + hojeFormatado2);
		
		System.out.println();
		
		dia_referencia = contagemInicial;	
		dataInicio = LocalDate.of(2022, 6, 14);
		int d = 14;
		int m = 6;
		int y = 2022;
		
		Calendar nascimento = Calendar.getInstance();
		SimpleDateFormat formato = new SimpleDateFormat(d+"/"+m+"/"+y );
		
		System.out.println("Data teste:"+formato.format(nascimento.getTime())); 
		
		long totalDiasFerias = ChronoUnit.DAYS.between(dataInicio, hoje);

		System.out.println("Data atual: " + sdf.format(data));
		

		// PEGA DIFERENÇA ENTRE AS DATAS

		days = ChronoUnit.DAYS.between(dataInicio, hoje);
		
		days-=1;

		System.out.println("Diferença de dia: " + days);
		
		int i;
		for (i = 1; i <= days; i++) {
		
			contagemInicial+=1;			
			
		}
		
		lbl_contagem.setText(String.valueOf(contagemInicial));
		System.out.println("Quadro Acidentes: " + contagemInicial);
			
		txt_dias_decorrente.setText(String.valueOf(totalDiasFerias));
		txt_dias_inicio.setText(String.valueOf(dia_referencia));
		txtComeco.setText(String.valueOf(formato.format(nascimento.getTime())));

		Thread atualizaHora = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					while (true) {
						Date date = new Date();
						StringBuffer data = new StringBuffer();

						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // Para Atualizar a DATA so
																							// mudar para o formato
																							// dd/MM/yyyy
						txt_data.setText(data.toString() + sdf.format(date));
//						System.out.println(data.toString() + sdf.format(date));
						Thread.sleep(1000);

						// textFieldHorario.revalidate();
					}
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}

			}
		});
		atualizaHora.start();

	}
}
