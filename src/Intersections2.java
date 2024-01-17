import Components.Activation;
import Components.Condition;
import Components.GuardMapping;
import Components.PetriNet;
import Components.PetriNetWindow;
import Components.PetriTransition;
import DataObjects.DataCar;
import DataObjects.DataCarQueue;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Intersections2 {
    public static void main(String[] args) {
        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Lanes Intersection";

        pn.NetworkPort = 1080;

        DataString green = new DataString();
        green.Printable = false;
        green.SetName("green");
        green.SetValue("green");
        pn.ConstantPlaceList.add(green);

        DataString full = new DataString();
        full.SetName("full");
        full.SetValue("full");
        pn.ConstantPlaceList.add(full);

        // --------------------------------------------------------------------
        // -------------------------------PIN 1--------------------------------
        // --------------------------------------------------------------------


        // --------------------------------------------------------------------
        // -------------------------------BD-UL 21 DECEMBRIE-------------------
        // --------------------------------------------------------------------

        DataTransfer OP1 = new DataTransfer();
        OP1.SetName("OP1");
        OP1.Value = new TransferOperation("localhost", "1081", "in1");
        pn.PlaceList.add(OP1);

        DataCar p1 = new DataCar();
        p1.SetName("P_a1");
        pn.PlaceList.add(p1);

        DataCarQueue p2 = new DataCarQueue();
        p2.Value.Size = 3;
        p2.SetName("P_x1");
        pn.PlaceList.add(p2);

        DataString p3 = new DataString();
        p3.SetName("P_TL1");
        pn.PlaceList.add(p3);

        DataCar p4 = new DataCar();
        p4.SetName("P_b1");
        pn.PlaceList.add(p4);

        // -------------------------------------------------------------------------------------
        // --------------------------------PIATA UNIRII-----------------------------------------
        // -------------------------------------------------------------------------------------

        DataTransfer OP2 = new DataTransfer();
        OP2.SetName("OP2");
        OP2.Value = new TransferOperation("localhost", "1081", "in2");
        pn.PlaceList.add(OP2);

        DataCar p5 = new DataCar(); //p5.Printable = false;
        p5.SetName("P_a2");
        pn.PlaceList.add(p5);

        DataCarQueue p6 = new DataCarQueue(); //p6.Printable = false;
        p6.Value.Size = 3;
        p6.SetName("P_x2");
        pn.PlaceList.add(p6);

        DataString p7 = new DataString(); //p7.Printable = false;
        p7.SetName("P_TL2");
        pn.PlaceList.add(p7);

        DataCar p8 = new DataCar(); //p8.Printable = false;
        p8.SetName("P_b2");
        pn.PlaceList.add(p8);

        // ----------------------------------------------------------------------------
        // ----------------------------STR. REGELE FERDINAND---------------------------
        // ----------------------------------------------------------------------------

        DataCarQueue p9 = new DataCarQueue();
        p9.Value.Size = 3;
        p9.SetName("P_o1");
        pn.PlaceList.add(p9);

        DataCar p10 = new DataCar();
        p10.SetName("P_o1e");
        pn.PlaceList.add(p10);

        // ----------------------------------------------------------------------------
        // ----------------------------PIATA UNIRII------------------------------------
        // ----------------------------------------------------------------------------

        DataCarQueue p11 = new DataCarQueue(); //p19.Printable = false;
        p11.Value.Size = 3;
        p11.SetName("P_o2");
        pn.PlaceList.add(p11);

        DataCar p12 = new DataCar(); //p20.Printable = false;
        p12.SetName("P_o2e");
        pn.PlaceList.add(p12);

        // -------------------------------------------------------------------------------------------
        // --------------------------------Intersection PIN 1-----------------------------------------
        // -------------------------------------------------------------------------------------------


        DataCarQueue p13 = new DataCarQueue();
        p13.Value.Size = 3;
        p13.SetName("P_I1");
        pn.PlaceList.add(p13);

        // ----------------------------------------------------------------------------
        // ----------------------------EXIT1 - STR. IOAN RATIU ------------------------
        // ----------------------------------------------------------------------------

        DataCar p14 = new DataCar(); //p22.Printable = false;
        p14.SetName("P1_1");
        pn.PlaceList.add(p14);

        DataCarQueue p15 = new DataCarQueue(); //p21.Printable = false;
        p15.Value.Size = 3;
        p15.SetName("P1_2");
        pn.PlaceList.add(p15);

        DataCar p16 = new DataCar(); //p22.Printable = false;
        p16.SetName("P1_3");
        pn.PlaceList.add(p16);

        DataCar p17 = new DataCar(); //p22.Printable = false;
        p17.SetName("P1_4");
        pn.PlaceList.add(p17);

        // ----------------------------------------------------------------------------
        // ----------------------------EXIT2 – STR. SAMUIL MICU -----------------------
        // ----------------------------------------------------------------------------

        DataCar p18 = new DataCar(); //p22.Printable = false;
        p18.SetName("P2_1");
        pn.PlaceList.add(p18);

        DataCarQueue p19 = new DataCarQueue(); //p21.Printable = false;
        p19.Value.Size = 3;
        p19.SetName("P2_2");
        pn.PlaceList.add(p19);

        DataCar p20 = new DataCar(); //p22.Printable = false;
        p20.SetName("P2_3");
        pn.PlaceList.add(p20);

        // --------------------------------------------------------------------
        // -------------------------------PIN 2--------------------------------
        // --------------------------------------------------------------------


        // --------------------------------------------------------------------
        // -------------------------------STR. MEMORANDUMULUI------------------
        // --------------------------------------------------------------------

        DataTransfer OP3 = new DataTransfer();
        OP3.SetName("OP3");
        OP3.Value = new TransferOperation("localhost", "1082", "in3");
        pn.PlaceList.add(OP3);

        DataCar p21 = new DataCar(); //p22.Printable = false;
        p21.SetName("P_a3");
        pn.PlaceList.add(p21);

        DataCarQueue p22 = new DataCarQueue();
        p22.Value.Size = 3;
        p22.SetName("P_x3");
        pn.PlaceList.add(p22);

        DataString p23 = new DataString();
        p23.SetName("P_TL3");
        pn.PlaceList.add(p23);

        DataCar p24 = new DataCar();
        p24.SetName("P_b3");
        pn.PlaceList.add(p24);

        // -------------------------------------------------------------------------------------
        // --------------------------------EMIL ISAC--------------------------------------------
        // -------------------------------------------------------------------------------------

        DataTransfer OP4 = new DataTransfer();
        OP4.SetName("OP4");
        OP4.Value = new TransferOperation("localhost", "1082", "in4");
        pn.PlaceList.add(OP4);

        DataCar p25 = new DataCar(); //p5.Printable = false;
        p25.SetName("P_a4");
        pn.PlaceList.add(p25);

        DataCarQueue p26 = new DataCarQueue(); //p6.Printable = false;
        p26.Value.Size = 3;
        p26.SetName("P_x4");
        pn.PlaceList.add(p26);

        DataString p27 = new DataString(); //p7.Printable = false;
        p27.SetName("P_TL4");
        pn.PlaceList.add(p27);

        DataCar p28 = new DataCar(); //p8.Printable = false;
        p28.SetName("P_b4");
        pn.PlaceList.add(p28);

        // ----------------------------------------------------------------------------
        // ----------------------------STR. GHEORGHE SINCAI - EXIT---------------------
        // ----------------------------------------------------------------------------

        DataCarQueue p29 = new DataCarQueue();
        p29.Value.Size = 3;
        p29.SetName("P_o3");
        pn.PlaceList.add(p9);

        DataCar p30 = new DataCar();
        p30.SetName("P_o3e");
        pn.PlaceList.add(p30);

        // ----------------------------------------------------------------------------
        // ----------------------------CALEA MOTILOR - EXIT----------------------------
        // ----------------------------------------------------------------------------

        DataCarQueue p31 = new DataCarQueue(); //p19.Printable = false;
        p31.Value.Size = 3;
        p31.SetName("P_o4");
        pn.PlaceList.add(p31);

        DataCar p32 = new DataCar(); //p20.Printable = false;
        p32.SetName("P_o4e");
        pn.PlaceList.add(p32);

        // -------------------------------------------------------------------------------------------
        // --------------------------------Intersection PIN 2-----------------------------------------
        // -------------------------------------------------------------------------------------------


        DataCarQueue p33 = new DataCarQueue();
        p33.Value.Size = 3;
        p33.SetName("P_I2");
        pn.PlaceList.add(p33);


        // -------------------------------------------------------------------------------------
        // ----------------------------PNStart-------------------------------------------------
        // -------------------------------------------------------------------------------------

        System.out.println("Lanes Intersection started \n ------------------------------");
        pn.Delay = 2000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
    }

}