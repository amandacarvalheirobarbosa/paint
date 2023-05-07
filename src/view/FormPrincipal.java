package view;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import primitivas.Curvas;
import primitivas.DrawArea;
import primitivas.MinhasLinhas;
import primitivas.PoligonosObjetos;
import primitivas.Primitivas;
import primitivas.Transformacoes;

public class FormPrincipal extends javax.swing.JFrame {

    private PoligonosObjetos g;
    private Primitivas png;
    private List<Point> lista;
    private DrawArea draw;
    private Image image;
    private int x, y;
    private int X1, Y1, oldX, oldY;

    private Arc2D arcBuffer;
    private Rectangle2D rectBuffer;
    private Line2D lineBuffer;
    private Ellipse2D circBuffer;
    private Graphics2D g2;
    
    private List<Arc2D> arcContainer = new ArrayList<>();
    private List<Line2D> lineConteiner = new ArrayList();
    private List<Ellipse2D> circContainer = new ArrayList();
    private List<Rectangle2D> rectContainer = new ArrayList();
    
    private Random rn = new Random();
    private MinhasLinhas ml[];

    public FormPrincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        lista = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn = new javax.swing.JPanel();
        pnMenu = new javax.swing.JPanel();
        pnCor = new javax.swing.JPanel();
        pnCorContorno = new javax.swing.JPanel();
        lblContorno = new javax.swing.JLabel();
        lblPreenchimento = new javax.swing.JLabel();
        pnCorPreenchimento = new javax.swing.JPanel();
        pnSegmentoReta = new javax.swing.JPanel();
        txtY1 = new javax.swing.JTextField();
        lblX1 = new javax.swing.JLabel();
        lblY1 = new javax.swing.JLabel();
        txtX1 = new javax.swing.JTextField();
        btnDesenharSegmentoReta = new javax.swing.JButton();
        lblX2 = new javax.swing.JLabel();
        txtX2 = new javax.swing.JTextField();
        lblY2 = new javax.swing.JLabel();
        txtY2 = new javax.swing.JTextField();
        pnCircunferencia = new javax.swing.JPanel();
        lblRaio = new javax.swing.JLabel();
        txtRaio = new javax.swing.JTextField();
        btnDesenharCircunferencia = new javax.swing.JButton();
        pnCurvas = new javax.swing.JPanel();
        btnCurvaHermite = new javax.swing.JButton();
        btnCurvaBezier = new javax.swing.JButton();
        btnCurvaBSplines = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtXY = new javax.swing.JTextField();
        pnTranslacao = new javax.swing.JPanel();
        txtTy = new javax.swing.JTextField();
        lblTx = new javax.swing.JLabel();
        lblTy = new javax.swing.JLabel();
        txtTx = new javax.swing.JTextField();
        btnDesenharTranslacao = new javax.swing.JButton();
        pnSegmentoReta5 = new javax.swing.JPanel();
        txtSy = new javax.swing.JTextField();
        lblX7 = new javax.swing.JLabel();
        lblY6 = new javax.swing.JLabel();
        txtSx = new javax.swing.JTextField();
        btnDesenharEscala = new javax.swing.JButton();
        pnRotacao = new javax.swing.JPanel();
        lblX6 = new javax.swing.JLabel();
        txtTheta = new javax.swing.JTextField();
        btnDesenharRotacao = new javax.swing.JButton();
        rdbLinha = new javax.swing.JRadioButton();
        rdbLapis = new javax.swing.JRadioButton();
        rdbBorracha = new javax.swing.JRadioButton();
        rdbSmile = new javax.swing.JRadioButton();
        rdbRetangulo = new javax.swing.JRadioButton();
        rdbArco = new javax.swing.JRadioButton();
        btnSetaCima = new javax.swing.JButton();
        btnSetaBaixo = new javax.swing.JButton();
        btnSetaDireita = new javax.swing.JButton();
        btnSetaEsquerda = new javax.swing.JButton();
        lblSetas = new javax.swing.JLabel();
        btnLetra = new javax.swing.JButton();
        btnEstrela5Pontas = new javax.swing.JButton();
        btnEstrela4Pontas = new javax.swing.JButton();
        btnLosango = new javax.swing.JButton();
        btnPentagono = new javax.swing.JButton();
        btnHexagono = new javax.swing.JButton();
        btnQuadrado = new javax.swing.JButton();
        btnTriangulo = new javax.swing.JButton();
        lblFormasAvaçandas = new javax.swing.JLabel();
        rdbElipse = new javax.swing.JRadioButton();
        barraMenu = new javax.swing.JMenuBar();
        menuArquivos = new javax.swing.JMenu();
        itemMenuAbrir = new javax.swing.JMenuItem();
        itemMenuSalvar = new javax.swing.JMenuItem();
        itemMenuSair = new javax.swing.JMenuItem();
        menuObjetos = new javax.swing.JMenu();
        itemMenuHexagono = new javax.swing.JMenuItem();
        itemMenuPentagono = new javax.swing.JMenuItem();
        itemMenuCasa = new javax.swing.JMenuItem();
        itemMenuCarro = new javax.swing.JMenuItem();
        itemMenuLosango = new javax.swing.JMenuItem();
        itemMenuPoligonos = new javax.swing.JMenuItem();
        menuSmile = new javax.swing.JMenu();
        itemMenuSmile = new javax.swing.JMenuItem();
        itemMenuPalitonio = new javax.swing.JMenuItem();
        itemMenuLinhas = new javax.swing.JMenuItem();
        itemMenuCirculos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn.setBackground(new java.awt.Color(255, 255, 255));
        pn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn.setPreferredSize(new java.awt.Dimension(2000, 2000));
        pn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnMouseMoved(evt);
            }
        });
        pn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnMouseReleased(evt);
            }
        });
        pn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                pnComponentResized(evt);
            }
        });

        javax.swing.GroupLayout pnLayout = new javax.swing.GroupLayout(pn);
        pn.setLayout(pnLayout);
        pnLayout.setHorizontalGroup(
            pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnLayout.setVerticalGroup(
            pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );

        pnCor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cor", 0, 0, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        pnCor.setPreferredSize(new java.awt.Dimension(60, 60));

        pnCorContorno.setBackground(new java.awt.Color(255, 0, 0));
        pnCorContorno.setPreferredSize(new java.awt.Dimension(60, 60));
        pnCorContorno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnCorContornoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnCorContornoLayout = new javax.swing.GroupLayout(pnCorContorno);
        pnCorContorno.setLayout(pnCorContornoLayout);
        pnCorContornoLayout.setHorizontalGroup(
            pnCorContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pnCorContornoLayout.setVerticalGroup(
            pnCorContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        lblContorno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblContorno.setText("contorno");
        lblContorno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblPreenchimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPreenchimento.setText("preenchimento");
        lblPreenchimento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pnCorPreenchimento.setBackground(new java.awt.Color(255, 0, 0));
        pnCorPreenchimento.setPreferredSize(new java.awt.Dimension(60, 60));
        pnCorPreenchimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnCorPreenchimentoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnCorPreenchimentoLayout = new javax.swing.GroupLayout(pnCorPreenchimento);
        pnCorPreenchimento.setLayout(pnCorPreenchimentoLayout);
        pnCorPreenchimentoLayout.setHorizontalGroup(
            pnCorPreenchimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pnCorPreenchimentoLayout.setVerticalGroup(
            pnCorPreenchimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnCorLayout = new javax.swing.GroupLayout(pnCor);
        pnCor.setLayout(pnCorLayout);
        pnCorLayout.setHorizontalGroup(
            pnCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorLayout.createSequentialGroup()
                .addGroup(pnCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContorno)
                    .addComponent(lblPreenchimento))
                .addGap(0, 4, Short.MAX_VALUE))
            .addGroup(pnCorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnCorPreenchimento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnCorContorno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnCorLayout.setVerticalGroup(
            pnCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(pnCorContorno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblContorno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnCorPreenchimento, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPreenchimento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnSegmentoReta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Segmento de Reta", 0, 0, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txtY1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblX1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblX1.setText("X1");

        lblY1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblY1.setText("Y1");

        txtX1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnDesenharSegmentoReta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDesenharSegmentoReta.setText("Desenhar");
        btnDesenharSegmentoReta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesenharSegmentoRetaActionPerformed(evt);
            }
        });

        lblX2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblX2.setText("X2");

        txtX2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblY2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblY2.setText("Y2");

        txtY2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnSegmentoRetaLayout = new javax.swing.GroupLayout(pnSegmentoReta);
        pnSegmentoReta.setLayout(pnSegmentoRetaLayout);
        pnSegmentoRetaLayout.setHorizontalGroup(
            pnSegmentoRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSegmentoRetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSegmentoRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDesenharSegmentoReta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnSegmentoRetaLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(pnSegmentoRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblX2)
                            .addComponent(lblX1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnSegmentoRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtX2)
                            .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnSegmentoRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblY1)
                            .addComponent(lblY2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnSegmentoRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtY2)
                            .addComponent(txtY1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnSegmentoRetaLayout.setVerticalGroup(
            pnSegmentoRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSegmentoRetaLayout.createSequentialGroup()
                .addGroup(pnSegmentoRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnSegmentoRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblY1)
                        .addComponent(lblX1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnSegmentoRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblX2)
                    .addComponent(lblY2))
                .addGap(18, 18, 18)
                .addComponent(btnDesenharSegmentoReta))
        );

        pnCircunferencia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Circunferência", 0, 0, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lblRaio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRaio.setText("Raio");

        txtRaio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnDesenharCircunferencia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDesenharCircunferencia.setText("Desenhar");
        btnDesenharCircunferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesenharCircunferenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCircunferenciaLayout = new javax.swing.GroupLayout(pnCircunferencia);
        pnCircunferencia.setLayout(pnCircunferenciaLayout);
        pnCircunferenciaLayout.setHorizontalGroup(
            pnCircunferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCircunferenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCircunferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDesenharCircunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnCircunferenciaLayout.createSequentialGroup()
                        .addComponent(lblRaio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRaio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnCircunferenciaLayout.setVerticalGroup(
            pnCircunferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCircunferenciaLayout.createSequentialGroup()
                .addGroup(pnCircunferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRaio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRaio))
                .addGap(18, 18, 18)
                .addComponent(btnDesenharCircunferencia)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        pnCurvas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Curvas", 0, 0, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        btnCurvaHermite.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCurvaHermite.setText("Hermite");
        btnCurvaHermite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurvaHermiteActionPerformed(evt);
            }
        });

        btnCurvaBezier.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCurvaBezier.setText("Bézier");
        btnCurvaBezier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurvaBezierActionPerformed(evt);
            }
        });

        btnCurvaBSplines.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCurvaBSplines.setText("B-Splines");
        btnCurvaBSplines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurvaBSplinesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCurvasLayout = new javax.swing.GroupLayout(pnCurvas);
        pnCurvas.setLayout(pnCurvasLayout);
        pnCurvasLayout.setHorizontalGroup(
            pnCurvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCurvasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnCurvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCurvaBSplines, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnCurvasLayout.createSequentialGroup()
                        .addComponent(btnCurvaHermite, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCurvaBezier))))
        );
        pnCurvasLayout.setVerticalGroup(
            pnCurvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCurvasLayout.createSequentialGroup()
                .addGroup(pnCurvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCurvaHermite, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnCurvaBezier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCurvaBSplines, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        txtXY.setEditable(false);
        txtXY.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtXY.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtXY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXYActionPerformed(evt);
            }
        });

        pnTranslacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Translação", 0, 0, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txtTy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblTx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTx.setText("Tx");

        lblTy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTy.setText("Ty");

        txtTx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnDesenharTranslacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDesenharTranslacao.setText("Desenhar");
        btnDesenharTranslacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesenharTranslacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTranslacaoLayout = new javax.swing.GroupLayout(pnTranslacao);
        pnTranslacao.setLayout(pnTranslacaoLayout);
        pnTranslacaoLayout.setHorizontalGroup(
            pnTranslacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTranslacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTranslacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTranslacaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTx, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTy, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDesenharTranslacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnTranslacaoLayout.setVerticalGroup(
            pnTranslacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTranslacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTranslacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTy)
                    .addComponent(lblTx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDesenharTranslacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnSegmentoReta5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Escala", 0, 0, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txtSy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblX7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblX7.setText("Sx");

        lblY6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblY6.setText("Sy");

        txtSx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnDesenharEscala.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDesenharEscala.setText("Desenhar");
        btnDesenharEscala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesenharEscalaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnSegmentoReta5Layout = new javax.swing.GroupLayout(pnSegmentoReta5);
        pnSegmentoReta5.setLayout(pnSegmentoReta5Layout);
        pnSegmentoReta5Layout.setHorizontalGroup(
            pnSegmentoReta5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSegmentoReta5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSegmentoReta5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnSegmentoReta5Layout.createSequentialGroup()
                        .addComponent(lblX7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSx, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblY6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSy, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDesenharEscala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnSegmentoReta5Layout.setVerticalGroup(
            pnSegmentoReta5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSegmentoReta5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSegmentoReta5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblY6)
                    .addComponent(lblX7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDesenharEscala)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnRotacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rotação", 0, 0, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lblX6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblX6.setText("<html>&Theta;</html>");

        txtTheta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnDesenharRotacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDesenharRotacao.setText("Desenhar");
        btnDesenharRotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesenharRotacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnRotacaoLayout = new javax.swing.GroupLayout(pnRotacao);
        pnRotacao.setLayout(pnRotacaoLayout);
        pnRotacaoLayout.setHorizontalGroup(
            pnRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRotacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDesenharRotacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnRotacaoLayout.createSequentialGroup()
                        .addComponent(lblX6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTheta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnRotacaoLayout.setVerticalGroup(
            pnRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRotacaoLayout.createSequentialGroup()
                .addGroup(pnRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTheta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblX6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDesenharRotacao, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        rdbLinha.setText("Linha");
        rdbLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbLinhaActionPerformed(evt);
            }
        });

        rdbLapis.setText("Lápis");

        rdbBorracha.setText("Borracha");

        rdbSmile.setText("Smile");

        rdbRetangulo.setText("Retângulo");
        rdbRetangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbRetanguloActionPerformed(evt);
            }
        });

        rdbArco.setText("Arco");

        btnSetaCima.setText("Cima");
        btnSetaCima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetaCimaActionPerformed(evt);
            }
        });

        btnSetaBaixo.setText("Baixo");
        btnSetaBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetaBaixoActionPerformed(evt);
            }
        });

        btnSetaDireita.setText("Direita");
        btnSetaDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetaDireitaActionPerformed(evt);
            }
        });

        btnSetaEsquerda.setText("Esquerda");
        btnSetaEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetaEsquerdaActionPerformed(evt);
            }
        });

        lblSetas.setText("Setas");

        btnLetra.setText("Letra A");
        btnLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraActionPerformed(evt);
            }
        });

        btnEstrela5Pontas.setText("Estrela 5 pontas");
        btnEstrela5Pontas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrela5PontasActionPerformed(evt);
            }
        });

        btnEstrela4Pontas.setText("Estrela 4 pontas");
        btnEstrela4Pontas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrela4PontasActionPerformed(evt);
            }
        });

        btnLosango.setText("Losango");
        btnLosango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLosangoActionPerformed(evt);
            }
        });

        btnPentagono.setText("Pentágono");
        btnPentagono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPentagonoActionPerformed(evt);
            }
        });

        btnHexagono.setText("Hexagono");
        btnHexagono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexagonoActionPerformed(evt);
            }
        });

        btnQuadrado.setText("Quadrado");

        btnTriangulo.setText("Triângulo");
        btnTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrianguloActionPerformed(evt);
            }
        });

        lblFormasAvaçandas.setText("Formas Avançadas");

        rdbElipse.setText("Elipse");

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addComponent(pnCor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnSegmentoReta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnMenuLayout.createSequentialGroup()
                                .addComponent(rdbLapis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbBorracha))
                            .addGroup(pnMenuLayout.createSequentialGroup()
                                .addComponent(rdbLinha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbArco))
                            .addGroup(pnMenuLayout.createSequentialGroup()
                                .addComponent(rdbRetangulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbSmile)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnMenuLayout.createSequentialGroup()
                                .addComponent(pnCircunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnCurvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtXY, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblSetas)
                            .addGroup(pnMenuLayout.createSequentialGroup()
                                .addComponent(btnSetaCima)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSetaBaixo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSetaDireita)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSetaEsquerda))))
                    .addComponent(rdbElipse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnMenuLayout.createSequentialGroup()
                                .addComponent(pnTranslacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnSegmentoReta5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblFormasAvaçandas)
                            .addGroup(pnMenuLayout.createSequentialGroup()
                                .addComponent(btnLetra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEstrela5Pontas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEstrela4Pontas)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnRotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addComponent(btnQuadrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTriangulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLosango)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHexagono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPentagono)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnCor, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnMenuLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblSetas, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSetaCima)
                                    .addComponent(btnSetaBaixo)
                                    .addComponent(btnSetaDireita)
                                    .addComponent(btnSetaEsquerda)))
                            .addGroup(pnMenuLayout.createSequentialGroup()
                                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnRotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnTranslacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnSegmentoReta5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnCircunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnCurvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFormasAvaçandas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnLetra)
                                    .addComponent(btnEstrela5Pontas)
                                    .addComponent(btnEstrela4Pontas))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQuadrado)
                            .addComponent(btnTriangulo)
                            .addComponent(btnLosango)
                            .addComponent(btnHexagono)
                            .addComponent(btnPentagono)))
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnSegmentoReta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnMenuLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(txtXY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbLapis)
                            .addComponent(rdbBorracha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbLinha)
                            .addComponent(rdbArco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbRetangulo)
                            .addComponent(rdbSmile))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbElipse)))
                .addContainerGap())
        );

        menuArquivos.setText("Arquivos");

        itemMenuAbrir.setText("Abrir");
        itemMenuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuAbrirActionPerformed(evt);
            }
        });
        menuArquivos.add(itemMenuAbrir);

        itemMenuSalvar.setText("Salvar");
        itemMenuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuSalvarActionPerformed(evt);
            }
        });
        menuArquivos.add(itemMenuSalvar);

        itemMenuSair.setText("Sair");
        itemMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuSairActionPerformed(evt);
            }
        });
        menuArquivos.add(itemMenuSair);

        barraMenu.add(menuArquivos);

        menuObjetos.setText("Objetos");

        itemMenuHexagono.setText("Hexagono");
        menuObjetos.add(itemMenuHexagono);

        itemMenuPentagono.setText("Pentagono");
        itemMenuPentagono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuPentagonoActionPerformed(evt);
            }
        });
        menuObjetos.add(itemMenuPentagono);

        itemMenuCasa.setText("Casa");
        menuObjetos.add(itemMenuCasa);

        itemMenuCarro.setText("Carro");
        itemMenuCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCarroActionPerformed(evt);
            }
        });
        menuObjetos.add(itemMenuCarro);

        itemMenuLosango.setText("Losango");
        menuObjetos.add(itemMenuLosango);

        itemMenuPoligonos.setText("Poligonos");
        menuObjetos.add(itemMenuPoligonos);

        barraMenu.add(menuObjetos);

        menuSmile.setText("Random");

        itemMenuSmile.setText("Smile");
        itemMenuSmile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuSmileActionPerformed(evt);
            }
        });
        menuSmile.add(itemMenuSmile);

        itemMenuPalitonio.setText("Palitonio");
        menuSmile.add(itemMenuPalitonio);

        itemMenuLinhas.setText("Linhas");
        itemMenuLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuLinhasActionPerformed(evt);
            }
        });
        menuSmile.add(itemMenuLinhas);

        itemMenuCirculos.setText("Círculos");
        menuSmile.add(itemMenuCirculos);

        barraMenu.add(menuSmile);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, 1425, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMouseMoved
        //mostra a posião x e y do mouse
        int x = evt.getX();
        int y = evt.getY();
        txtXY.setText(String.format("%d,%d", x, y));

    }//GEN-LAST:event_pnMouseMoved

    private void pnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMouseClicked
        png.desenharPixel(evt.getX(), evt.getY(), pnCorContorno.getBackground());
        lista.add(new Point(evt.getX(), evt.getY()));
    }//GEN-LAST:event_pnMouseClicked

    private void pnCorContornoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnCorContornoMouseClicked
        //seletor de cores
        Color cor = JColorChooser.showDialog(this, "Selecione a cor", pnCor.getBackground());
        pnCorContorno.setBackground(cor);
    }//GEN-LAST:event_pnCorContornoMouseClicked

    private void btnDesenharSegmentoRetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesenharSegmentoRetaActionPerformed
        //desenha segmento de reta
        try {
            int x1 = Integer.parseInt(txtX1.getText());
            int y1 = Integer.parseInt(txtY1.getText());
            int x2 = Integer.parseInt(txtX2.getText());
            int y2 = Integer.parseInt(txtY2.getText());

            png.desenharSegmentoRetaBresenham(x1, y1, x2, y2,
                    pnCorContorno.getBackground());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDesenharSegmentoRetaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        //limpar tela
        png.limpar();
        pn.update(g2);
        circContainer.clear();
        lineConteiner.clear();
        rectContainer.clear();
        arcContainer.clear();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnDesenharCircunferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesenharCircunferenciaActionPerformed
        //desenhar circulo
        try {
            int raio = Integer.parseInt(txtRaio.getText());
            png.desenharCircunferencia(raio, pnCorContorno.getBackground());

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDesenharCircunferenciaActionPerformed

    private void btnCurvaHermiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurvaHermiteActionPerformed
        //Curva de Hermite precisa de DOIS pontos
        if (lista.size() >= 2) {
            Curvas.Hermite(
                    png.getGraphics(),
                    lista.get(0),
                    lista.get(1),
                    +500, -500,
                    pnCorContorno.getBackground()
            );
            lista.clear();
        }
    }//GEN-LAST:event_btnCurvaHermiteActionPerformed

    private void btnCurvaBezierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurvaBezierActionPerformed
        //Curva de Bézier precisa de QUATRO pontos
        if (lista.size() >= 4) {
            Curvas.Bezier(
                    png.getGraphics(),
                    lista.get(0),
                    lista.get(1),
                    lista.get(2),
                    lista.get(3),
                    pnCorContorno.getBackground()
            );
            lista.clear();
        }
    }//GEN-LAST:event_btnCurvaBezierActionPerformed

    private void btnCurvaBSplinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurvaBSplinesActionPerformed
        Curvas.BSplines(
                png.getGraphics(),
                lista,
                pnCorContorno.getBackground()
        );
    }//GEN-LAST:event_btnCurvaBSplinesActionPerformed

    private void pnComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnComponentResized
        //redimensionamento da janela
        png = new Primitivas(pn.getSize());
        pn.add(png);
    }//GEN-LAST:event_pnComponentResized

    private void btnDesenharTranslacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesenharTranslacaoActionPerformed
        //transladar 
        int tx = Integer.parseInt(txtTx.getText());
        int ty = Integer.parseInt(txtTy.getText());

        new Transformacoes().translacao(lista, tx, ty);
        png.limpar();
        png.desenharPoligono(lista, pnCorContorno.getBackground());
    }//GEN-LAST:event_btnDesenharTranslacaoActionPerformed

    private void btnDesenharEscalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesenharEscalaActionPerformed
        double Sx = Double.parseDouble(txtSx.getText());
        double Sy = Double.parseDouble(txtSy.getText());

        new Transformacoes().escala(lista, Sx, Sy);
        png.limpar();
        png.desenharPoligono(lista, pnCorContorno.getBackground());
    }//GEN-LAST:event_btnDesenharEscalaActionPerformed

    private void txtXYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXYActionPerformed

    }//GEN-LAST:event_txtXYActionPerformed

    private void btnTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrianguloActionPerformed
        //desenhar triangulo
        int cx = pn.getWidth() / 2;
        int cy = png.getHeight() / 2;

        lista.clear();
        lista.add(new Point(cx, cy - 100));
        lista.add(new Point(cx - 100, cy + 100));
        lista.add(new Point(cx + 100, cy + 100));
        png.desenharPoligono(lista, pnCorContorno.getBackground());
    }//GEN-LAST:event_btnTrianguloActionPerformed

    private void btnDesenharRotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesenharRotacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDesenharRotacaoActionPerformed

    private void itemMenuSmileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSmileActionPerformed

    }//GEN-LAST:event_itemMenuSmileActionPerformed

    private void itemMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemMenuSairActionPerformed

    private void pnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMousePressed
        if (g2 == null) {
            g2 = (Graphics2D) pn.getGraphics();
        }
        X1 = evt.getX();
        Y1 = evt.getY();
        oldX = evt.getX();
        oldY = evt.getY();
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_pnMousePressed

    private void pnMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMouseDragged
        //draw line
        if (rdbLinha.isSelected()) {

            pn.update(g2);
            oldX = evt.getX();
            oldY = evt.getY();

            lineBuffer = new Line2D.Float((float) X1, (float) Y1, (float) oldX, (float) oldY);
            g2.draw(lineBuffer);
            DrawAll();
        }
        if (rdbRetangulo.isSelected()) {

            pn.update(g2);
            oldX = evt.getX();
            oldY = evt.getY();

            rectBuffer = new Rectangle2D.Float((float) X1, (float) Y1, (float) oldX, (float) oldY);
            g2.draw(rectBuffer);
            DrawAll();
        }
        if (rdbArco.isSelected()) {

            pn.update(g2);
            oldX = evt.getX();
            oldY = evt.getY();

            arcBuffer = new Arc2D.Float((float) X1, (float) Y1, (float) oldX, (float) oldY, 100, 130, Arc2D.OPEN);
            g2.draw(arcBuffer);
            DrawAll();
        }
        if (rdbSmile.isSelected()) {

            //desenhando a carinhas
            g2.setColor(Color.YELLOW);
            g2.fillOval(10, 10, 200, 200);

            //desenhando os olhos
            g2.setColor(Color.BLACK);
            g2.fillOval(55, 65, 30, 30);
            g2.fillOval(135, 65, 30, 30);

            //desenhando a boca
            g2.fillOval(50, 110, 120, 60);

            //retocando a boca para criar um sorriso
            g2.setColor(Color.YELLOW);
            g2.fillRect(50, 110, 120, 30);
            g2.fillOval(50, 120, 120, 40);
        }
        
        //Lápis e borracha
        int x1 = evt.getX(), y1 = evt.getY();
        if(rdbLapis.isSelected() == true){
            png.lapis(x,y, x1, y1, pnCorContorno.getBackground());
            x = x1;
            y = y1;                  
        }else if(rdbBorracha.isSelected() == true){
            png.borracha(x,y, x1, y1);
            x = x1;
            y = y1;
        }
    }//GEN-LAST:event_pnMouseDragged

    private void pnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMouseReleased
        if (rdbLinha.isSelected()) {

            pn.update(g2);
            oldX = evt.getX();
            oldY = evt.getY();

            lineBuffer = new Line2D.Float((float) X1, (float) Y1, (float) oldX, (float) oldY);
            lineConteiner.add(lineBuffer);
            DrawAll();
        }

        if (rdbRetangulo.isSelected()) {

            pn.update(g2);
            oldX = evt.getX();
            oldY = evt.getY();

            rectBuffer = new Rectangle2D.Float((float) X1, (float) Y1, (float) oldX, (float) oldY);
            rectContainer.add(rectBuffer);
            DrawAll();
        }

        if (rdbArco.isSelected()) {
            pn.update(g2);
            oldX = evt.getX();
            oldY = evt.getY();
            arcBuffer = new Arc2D.Float((float) X1, (float) Y1, (float) oldX, (float) oldY, 90, 135, Arc2D.OPEN);
            arcContainer.add(arcBuffer);
            DrawAll();
        }
        if (rdbSmile.isSelected()) {

            //desenhando a carinhas
            g2.setColor(Color.YELLOW);
            g2.fillOval(10, 10, 200, 200);

            //desenhando os olhos
            g2.setColor(Color.BLACK);
            g2.fillOval(55, 65, 30, 30);
            g2.fillOval(135, 65, 30, 30);

            //desenhando a boca
            g2.fillOval(50, 110, 120, 60);

            //retocando a boca para criar um sorriso
            g2.setColor(Color.YELLOW);
            g2.fillRect(50, 110, 120, 30);
            g2.fillOval(50, 120, 120, 40);
        }
    }//GEN-LAST:event_pnMouseReleased

    private void rdbLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbLinhaActionPerformed

    }//GEN-LAST:event_rdbLinhaActionPerformed

    private void itemMenuPentagonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuPentagonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemMenuPentagonoActionPerformed

    private void itemMenuCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemMenuCarroActionPerformed

    private void itemMenuLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuLinhasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemMenuLinhasActionPerformed

    private void itemMenuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemMenuAbrirActionPerformed

    private void btnLosangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLosangoActionPerformed
        int cx = pn.getWidth()/2;
        int cy = png.getHeight()/2;

        lista.clear();
        lista.add(new Point(cx+125,cy));
        lista.add(new Point(cx,cy+100));
        lista.add(new Point(cx-125,cy));
        lista.add(new Point(cx,cy-100));
        png.desenharPoligono(lista, pnCorContorno.getBackground());
    }//GEN-LAST:event_btnLosangoActionPerformed

    private void btnPentagonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPentagonoActionPerformed
        int cx = pn.getWidth()/2;
        int cy = png.getHeight()/2;

        lista.clear();
        lista.add(new Point(cx,cy-180));
        lista.add(new Point(cx+170,cy-60));
        lista.add(new Point(cx+110,cy+145));
        lista.add(new Point(cx-110,cy+145));
        lista.add(new Point(cx-170,cy-60));
        png.desenharPoligono(lista, pnCorContorno.getBackground());
    }//GEN-LAST:event_btnPentagonoActionPerformed

    private void btnHexagonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexagonoActionPerformed
        int cx = pn.getWidth()/2;
        int cy = png.getHeight()/2;

        lista.clear();
        lista.add(new Point(cx,cy+140));
        lista.add(new Point(cx+130,cy+70));
        lista.add(new Point(cx+130,cy-70));
        lista.add(new Point(cx,cy-140));
        lista.add(new Point(cx-130,cy-70));
        lista.add(new Point(cx-130,cy+70));
        png.desenharPoligono(lista, pnCorContorno.getBackground());
    }//GEN-LAST:event_btnHexagonoActionPerformed

    private void btnSetaCimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaCimaActionPerformed
        int cx = pn.getWidth()/2;
        int cy = png.getHeight()/2;

        lista.clear();
        lista.add(new Point(cx+55,cy));
        lista.add(new Point(cx+105,cy));
        lista.add(new Point(cx,cy-240));
        lista.add(new Point(cx-105,cy));
        lista.add(new Point(cx-55,cy));
        lista.add(new Point(cx-55,cy+250));
        lista.add(new Point(cx+55,cy+250));
        png.desenharPoligono(lista, pnCorContorno.getBackground());
    }//GEN-LAST:event_btnSetaCimaActionPerformed

    private void rdbRetanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbRetanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbRetanguloActionPerformed

    private void btnLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraActionPerformed
        int cx = pn.getWidth()/2;
        int cy = png.getHeight()/2;

        lista.clear();
                
        lista.add(new Point(cx+237,cy+182));
        lista.add(new Point(cx+258,cy+125));
        lista.add(new Point(cx+280,cy+183));
        lista.add(new Point(cx+274,cy+165));
        lista.add(new Point(cx+244,cy+164));
        
        png.desenharPoligono(lista, pnCorContorno.getBackground());
    }//GEN-LAST:event_btnLetraActionPerformed

    private void btnEstrela5PontasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstrela5PontasActionPerformed
        int cx = pn.getWidth()/2;
        int cy = png.getHeight()/2;

        lista.clear();
        lista.add(new Point(cx,cy-210));
        lista.add(new Point(cx+50,cy-70));
        lista.add(new Point(cx+190,cy-60));
        lista.add(new Point(cx+80,cy+30));
        lista.add(new Point(cx+120,cy+170));
        lista.add(new Point(cx,cy+90));
        lista.add(new Point(cx-120,cy+170));
        lista.add(new Point(cx-80,cy+30));
        lista.add(new Point(cx-190,cy-60));
        lista.add(new Point(cx-50,cy-70));
        png.desenharPoligono(lista, pnCorContorno.getBackground());
    }//GEN-LAST:event_btnEstrela5PontasActionPerformed

    private void btnSetaBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaBaixoActionPerformed
        int cx = pn.getWidth()/2;
        int cy = png.getHeight()/2;

        lista.clear();
        lista.add(new Point(cx+55,cy));
        lista.add(new Point(cx+105,cy));
        lista.add(new Point(cx,cy+240));
        lista.add(new Point(cx-105,cy));
        lista.add(new Point(cx-55,cy));
        lista.add(new Point(cx-55,cy-250));
        lista.add(new Point(cx+55,cy-250));
        png.desenharPoligono(lista, pnCorContorno.getBackground());
    }//GEN-LAST:event_btnSetaBaixoActionPerformed

    private void btnSetaEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaEsquerdaActionPerformed
        int cx = pn.getWidth()/2;
        int cy = png.getHeight()/2;

        lista.clear();
        lista.add(new Point(cx,cy+55));
        lista.add(new Point(cx,cy+105));
        lista.add(new Point(cx-240,cy));
        lista.add(new Point(cx,cy-105));
        lista.add(new Point(cx,cy-55));
        lista.add(new Point(cx+250,cy-55));
        lista.add(new Point(cx+250,cy+55));
        png.desenharPoligono(lista, pnCorContorno.getBackground());
    }//GEN-LAST:event_btnSetaEsquerdaActionPerformed

    private void btnSetaDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaDireitaActionPerformed
        int cx = pn.getWidth()/2;
        int cy = png.getHeight()/2;

        lista.clear();
        lista.add(new Point(cx,cy+55));
        lista.add(new Point(cx,cy+105));
        lista.add(new Point(cx+240,cy));
        lista.add(new Point(cx,cy-105));
        lista.add(new Point(cx,cy-55));
        lista.add(new Point(cx-250,cy-55));
        lista.add(new Point(cx-250,cy+55));
        png.desenharPoligono(lista, pnCorContorno.getBackground());
    }//GEN-LAST:event_btnSetaDireitaActionPerformed

    private void btnEstrela4PontasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstrela4PontasActionPerformed
        int cx = pn.getWidth()/2;
        int cy = png.getHeight()/2;

        lista.clear();
        lista.add(new Point(cx,cy+200));
        lista.add(new Point(cx+50,cy+50));
        lista.add(new Point(cx+200,cy));
        lista.add(new Point(cx+50,cy-50));
        lista.add(new Point(cx,cy-200));
        lista.add(new Point(cx-50,cy-50));
        lista.add(new Point(cx-200,cy));
        lista.add(new Point(cx-50,cy+50));
        png.desenharPoligono(lista, pnCorContorno.getBackground());
    }//GEN-LAST:event_btnEstrela4PontasActionPerformed

    private void itemMenuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemMenuSalvarActionPerformed

    private void pnCorPreenchimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnCorPreenchimentoMouseClicked
        Color cor = JColorChooser.showDialog(this, "Selecione a cor", pnCor.getBackground());
        pnCorPreenchimento.setBackground(cor);
    }//GEN-LAST:event_pnCorPreenchimentoMouseClicked
    private void DrawAll() {
        for (int i = 0; i < lineConteiner.size(); i++) {
            g2.draw(lineConteiner.get(i));
        }

        for (int i = 0; i < circContainer.size(); i++) {
            g2.draw(circContainer.get(i));
        }
        for (int i = 0; i < rectContainer.size(); i++) {
            g2.draw(rectContainer.get(i));
        }
        for (int i = 0; i < arcContainer.size(); i++) {
            g2.draw(arcContainer.get(i));
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnCurvaBSplines;
    private javax.swing.JButton btnCurvaBezier;
    private javax.swing.JButton btnCurvaHermite;
    private javax.swing.JButton btnDesenharCircunferencia;
    private javax.swing.JButton btnDesenharEscala;
    private javax.swing.JButton btnDesenharRotacao;
    private javax.swing.JButton btnDesenharSegmentoReta;
    private javax.swing.JButton btnDesenharTranslacao;
    private javax.swing.JButton btnEstrela4Pontas;
    private javax.swing.JButton btnEstrela5Pontas;
    private javax.swing.JButton btnHexagono;
    private javax.swing.JButton btnLetra;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLosango;
    private javax.swing.JButton btnPentagono;
    private javax.swing.JButton btnQuadrado;
    private javax.swing.JButton btnSetaBaixo;
    private javax.swing.JButton btnSetaCima;
    private javax.swing.JButton btnSetaDireita;
    private javax.swing.JButton btnSetaEsquerda;
    private javax.swing.JButton btnTriangulo;
    private javax.swing.JMenuItem itemMenuAbrir;
    private javax.swing.JMenuItem itemMenuCarro;
    private javax.swing.JMenuItem itemMenuCasa;
    private javax.swing.JMenuItem itemMenuCirculos;
    private javax.swing.JMenuItem itemMenuHexagono;
    private javax.swing.JMenuItem itemMenuLinhas;
    private javax.swing.JMenuItem itemMenuLosango;
    private javax.swing.JMenuItem itemMenuPalitonio;
    private javax.swing.JMenuItem itemMenuPentagono;
    private javax.swing.JMenuItem itemMenuPoligonos;
    private javax.swing.JMenuItem itemMenuSair;
    private javax.swing.JMenuItem itemMenuSalvar;
    private javax.swing.JMenuItem itemMenuSmile;
    private javax.swing.JLabel lblContorno;
    private javax.swing.JLabel lblFormasAvaçandas;
    private javax.swing.JLabel lblPreenchimento;
    private javax.swing.JLabel lblRaio;
    private javax.swing.JLabel lblSetas;
    private javax.swing.JLabel lblTx;
    private javax.swing.JLabel lblTy;
    private javax.swing.JLabel lblX1;
    private javax.swing.JLabel lblX2;
    private javax.swing.JLabel lblX6;
    private javax.swing.JLabel lblX7;
    private javax.swing.JLabel lblY1;
    private javax.swing.JLabel lblY2;
    private javax.swing.JLabel lblY6;
    private javax.swing.JMenu menuArquivos;
    private javax.swing.JMenu menuObjetos;
    private javax.swing.JMenu menuSmile;
    private javax.swing.JPanel pn;
    private javax.swing.JPanel pnCircunferencia;
    private javax.swing.JPanel pnCor;
    private javax.swing.JPanel pnCorContorno;
    private javax.swing.JPanel pnCorPreenchimento;
    private javax.swing.JPanel pnCurvas;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnRotacao;
    private javax.swing.JPanel pnSegmentoReta;
    private javax.swing.JPanel pnSegmentoReta5;
    private javax.swing.JPanel pnTranslacao;
    private javax.swing.JRadioButton rdbArco;
    private javax.swing.JRadioButton rdbBorracha;
    private javax.swing.JRadioButton rdbElipse;
    private javax.swing.JRadioButton rdbLapis;
    private javax.swing.JRadioButton rdbLinha;
    private javax.swing.JRadioButton rdbRetangulo;
    private javax.swing.JRadioButton rdbSmile;
    private javax.swing.JTextField txtRaio;
    private javax.swing.JTextField txtSx;
    private javax.swing.JTextField txtSy;
    private javax.swing.JTextField txtTheta;
    private javax.swing.JTextField txtTx;
    private javax.swing.JTextField txtTy;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    private javax.swing.JTextField txtXY;
    private javax.swing.JTextField txtY1;
    private javax.swing.JTextField txtY2;
    // End of variables declaration//GEN-END:variables
    public void configuarFormulario() {
        setVisible(true);
        setTitle("Rabiscando");
    }
}
