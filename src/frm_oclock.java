import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class frm_oclock extends JFrame implements Runnable {

    JLabel lbTime, lbMinite, lbSecond, lbHour, lbDay, lbDate, lbRunningTime;
    JProgressBar secondsProgress, miintiesProgress, hoursProgress;
    JPanel panelTime, panelRunningTime;
    JButton btnTime, btnRunningTime;
    ;

    //the tools foor the relax_time part
    JPanel panelRelaxTime;
    JLabel lbRelaxTime;
    JButton btnRelax;

    // the can get the screen size
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double wigth = screenSize.getWidth();
    double height = screenSize.getHeight();

    int frm_weight = 400;
    int frm_height = 300;

    frm_oclock() {
        panelTime = new JPanel();
        panelTime.setLayout(null);
        panelTime.setBounds(0, 0, frm_weight - 100, frm_height);
        panelTime.setBackground(Color.BLACK);
        add(panelTime);
        lbTime = new JLabel("test");
        lbTime.setBounds(0, 0, 200, 100);
        lbTime.setFont(new Font("", Font.BOLD, 48));
        lbTime.setForeground(Color.white);
        panelTime.add(lbTime);


        lbDay = new JLabel("day");
        lbDay.setBounds(200, 0, 100, 25);
        lbDay.setFont(new Font("", Font.BOLD, 16));
        lbDay.setForeground(Color.white);
        panelTime.add(lbDay);

        lbDate = new JLabel("date");
        lbDate.setBounds(200, 25, 100, 25);
        lbDate.setFont(new Font("", Font.BOLD, 16));
        lbDate.setForeground(Color.white);
        panelTime.add(lbDate);


        secondsProgress = new JProgressBar();
        secondsProgress.setValue(0);
        secondsProgress.setMaximum(60);
        secondsProgress.setBounds(0, 125, 200, 20);
        secondsProgress.setBackground(Color.cyan);
        secondsProgress.setForeground(Color.RED);
        panelTime.add(secondsProgress);
        lbSecond = new JLabel("seconds ");
        lbSecond.setBounds(0, 100, 200, 20);
        lbSecond.setFont(new Font("", Font.BOLD, 16));
        lbSecond.setForeground(Color.white);
        panelTime.add(lbSecond);

        miintiesProgress = new JProgressBar();
        miintiesProgress.setValue(0);
        miintiesProgress.setMaximum(60);
        miintiesProgress.setBounds(0, 175, 200, 20);
        miintiesProgress.setBackground(Color.cyan);
        miintiesProgress.setForeground(Color.RED);
        panelTime.add(miintiesProgress);
        lbMinite = new JLabel("minits ");
        lbMinite.setBounds(0, 150, 200, 20);
        lbMinite.setFont(new Font("", Font.BOLD, 16));
        lbMinite.setForeground(Color.white);
        panelTime.add(lbMinite);

        lbHour = new JLabel("hours ");
        lbHour.setBounds(0, 200, 200, 20);
        lbHour.setFont(new Font("", Font.BOLD, 16));
        lbHour.setForeground(Color.white);
        panelTime.add(lbHour);
        hoursProgress = new JProgressBar();
        hoursProgress.setValue(0);
        hoursProgress.setMaximum(24);
        hoursProgress.setBounds(0, 220, 200, 20);
        hoursProgress.setBackground(Color.cyan);
        hoursProgress.setForeground(Color.RED);
        panelTime.add(hoursProgress);

        //the part of runnih time
        panelRunningTime = new JPanel();
        panelRunningTime = new JPanel();
        panelRunningTime.setLayout(null);
        panelRunningTime.setBounds(0, 0, frm_weight - 100, frm_height);
        panelRunningTime.setBackground(Color.BLACK);
        panelRunningTime.hide();
        add(panelRunningTime);

        lbRunningTime = new JLabel("test");
        lbRunningTime.setBounds(0, 0, 200, 100);
        lbRunningTime.setFont(new Font("", Font.BOLD, 48));
        lbRunningTime.setForeground(Color.white);
        panelRunningTime.add(lbRunningTime);


        btnTime = new JButton("Time");
        btnTime.setBounds(305, 0, 90, 30);
        btnTime.setFont(new Font("", Font.BOLD, 20));
        btnTime.setBackground(Color.BLACK);
        btnTime.setForeground(Color.WHITE);
        btnTime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelTime.show();
                panelRunningTime.hide();
                panelRelaxTime.hide();
            }
        });
        add(btnTime);

        btnRunningTime = new JButton("Running time");
        btnRunningTime.setBounds(305, 40, 90, 30);
        btnRunningTime.setFont(new Font("", Font.BOLD, 20));
        btnRunningTime.setBackground(Color.BLACK);
        btnRunningTime.setForeground(Color.WHITE);
        btnRunningTime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelTime.hide();
                panelRunningTime.show();
                panelRelaxTime.hide();
            }
        });
        add(btnRunningTime);




        //the part of reöax time
        panelRelaxTime = new JPanel();
        panelRelaxTime.setBounds(0,0,frm_weight-100,frm_height);
        panelRelaxTime.setLayout(null);
        panelRelaxTime.setBackground(Color.BLACK);
        panelRelaxTime.hide();
        add(panelRelaxTime);

        lbRelaxTime = new JLabel("test");
        lbRelaxTime.setBounds(0, 0, 200, 100);
        lbRelaxTime.setFont(new Font("", Font.BOLD, 48));
        lbRelaxTime.setForeground(Color.white);
        panelRelaxTime.add(lbRelaxTime);



        btnRelax = new JButton("Relax");
        btnRelax.setBounds(305,80,90,30);
        btnRelax.setBackground(Color.BLACK);
        btnRelax.setForeground(Color.WHITE);
        btnRelax.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelTime.hide();
                panelRunningTime.hide();
                panelRelaxTime.show();
            }
        });
        add(btnRelax);

        setLocation((int) (wigth - frm_weight), (int) (height - frm_height));
        setSize(400, 300);
        getContentPane().setBackground(Color.BLACK);
        setUndecorated(true);
        setLayout(null);

        setVisible(true);
        setOpacity(0.55f);
    }

    // to show the real time on the frame

    public void time_view() {
        LocalTime time = LocalTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formatterTime = time.format(df);
        int seconds = time.getSecond();
        int minites = time.getMinute();
        int hours = time.getHour();
        secondsProgress.setValue(seconds);
        miintiesProgress.setValue(minites);
        hoursProgress.setValue(hours);
        lbTime.setText((formatterTime));
    }

    public void day_view() {
        LocalDate date = LocalDate.now();
        String day = String.valueOf(date.getDayOfWeek());
        lbDay.setText(day);
    }

    public void date_view() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy:MM:dd");
        String formatterDate = date.format(df);
        lbDate.setText(formatterDate);
    }


    int seconds = 0;
    int minites = 0;
    int hours = 0;
    LocalTime startTime = LocalTime.now();
    LocalDateTime runningDate = LocalDateTime.now();
    Running_Time runningTime ;
    public void view_runningTime() {
        seconds++;
        if (seconds > 59) {
            seconds = 0;
            minites++;
            if (minites > 59) {
                minites = 0;
                hours++;
            }
        }
        LocalTime endTime = LocalTime.now();
        String str1 = (hours + ":" + minites + ":" + seconds);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss");
        String str2 = df.format(startTime);
        String str3 = df.format(endTime);
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yyyy:MM:dd");
        String str4 = runningDate.format(df1);
        runningTime = new Running_Time(str1,str2,str3,str4);
        lbRunningTime.setText(runningTime.getRunningTime());
    }

    @Override
    public void run() {
        while (true) {
            time_view();
            day_view();
            date_view();
            view_runningTime();
            view_RelaxTime();


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    int relaxTimeSeconds = 0;
    int relaxTimeMinites = 1;
    int relaxTimehours = 0;
    public void view_RelaxTime(){
        if (relaxTimeMinites == 0 && relaxTimeSeconds == 0 && relaxTimehours == 0){
            lbRelaxTime.setText("set value");
        }else{
            relaxTimeSeconds++;
            if (relaxTimeSeconds >59) {
                relaxTimeSeconds = 0;
                relaxTimeMinites--;
                if (relaxTimeMinites == 59 && relaxTimeSeconds == 0) {
                    relaxTimehours--;
                }
            }
            String str1 = (relaxTimehours + ":" + relaxTimeMinites + ":" + relaxTimeSeconds);
            if(minites > -5){
                lbRelaxTime.setText(str1);
                //lbRelaxTime.setText("less C:\Users\msa_a\.jdks\corretto-17.0.13\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.1\lib\idea_rt.jar=61164:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.1\bin" -Dfile.encoding=UTF-8 -classpath D:\oclock_on_desktop\out\production\oclock_on_desktop frm_oclockof 5 minites left to tax a break");
            }
        }


    }



    public static void main(String[] args) {
        new frm_oclock().run();
    }
}
