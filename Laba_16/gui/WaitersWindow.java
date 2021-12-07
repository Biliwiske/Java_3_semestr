package Laba_16.gui;

import Laba_16.exceptons.NoFreeTablesException;
import Laba_16.gui.parts.GeneralMenu;
import Laba_16.gui.parts.OrderPane;

import javax.swing.*;
import java.awt.*;

public class WaitersWindow extends JFrame {

    private JTabbedPane wTables;
    JLabel Label;

    public WaitersWindow(){
        setSize(860, 360);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("Меню официанта");
        Label = new JLabel("Тип элемента заказа");
        wTables = new JTabbedPane();
        wTables.setTabPlacement(SwingConstants.RIGHT);
        var newGuest = new JButton("Обслужить гостя");
        newGuest.addActionListener(e->{
            int[] tn;
            try
            {
                tn = Controller.getInstance().getFreeNums();
            }
            catch (NoFreeTablesException ex)
            {
                JOptionPane.showMessageDialog(this, ex.getMessage());
                return;
            }
            Integer[] tno = new Integer[tn.length];
            for (int i = 0; i < tn.length; i++)
            {
                tno[i] = tn[i]+1;
            }
            Integer t = (Integer) JOptionPane.showInputDialog(this, "Укажите номер стола: ", "Начать обработку заказа", JOptionPane.INFORMATION_MESSAGE, null, tno,  tno[0]);
            try{
                Controller.getInstance().addOrder(t-1, JOptionPane.showConfirmDialog(this, "Гость уже совершеннолетний?", "Начало работы с клиентом", JOptionPane.YES_NO_OPTION) == 0);
            }catch (NullPointerException ignored){}

            wTables.addTab("Столик № "+t, new OrderPane(t-1));

        });

        getContentPane().add(newGuest, BorderLayout.NORTH);
        getContentPane().add(wTables, BorderLayout.CENTER);

        setJMenuBar(new GeneralMenu(this, new JMenu[0]));
    }

    public void onRemovedOrder(int tNum){
        for(int i = 0; i < wTables.getTabCount(); i++){
            if(Integer.parseInt(wTables.getTitleAt(i).substring(9)) - 1 == tNum){
                wTables.removeTabAt(i);
                break;
            }
        } }
}
