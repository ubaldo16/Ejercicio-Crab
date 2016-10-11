import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
    public final int TIEMPO_NIVEL = 15;
    private Counter contGusanos;
    private Counter contVidas;
    private Counter contTiempo;
    private SimpleTimer reloj;
    private SimpleTimer reloj2;
    private Crab cangrejo;
    private Lobster Langosta;
    private Label etiquetaFin;
   
    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        contGusanos = new Counter("Gusanos: ");
        contVidas = new Counter("Vidas: ");
        addObject(contGusanos,68,20);
        addObject(contVidas,68,60);
        contVidas.setValue(3);
        prepare();
        contTiempo.setValue(TIEMPO_NIVEL);
        reloj = new SimpleTimer();
        reloj2 = new SimpleTimer();
    }

    public void started()
    {
        reloj.mark();
        System.out.println("Boton Run prisionado");
    }
    public void stopped()
    {
      System.out.println("Boton Stop presionado");
    }
    
    public void act()
    {
        //contGusanos.act();
        if(reloj.millisElapsed()>1000)
        {
            contTiempo.add(-1);
            reloj.mark();
        }
        /*if(reloj.millisElapsed()>3000)
        {
            
            reloj.mark();
        }*/
        
    }

    public void incrementaGusanos()
    {
        contGusanos.add(1);
    }
    public void decrementaVidas()
    {
        contVidas.add(-1);
    }
    
    public void reiniciaPosCangrejo()
    {
       cangrejo.setLocation(287,339); 
    }
    
    public void cangrejoAtrapado()
    {
        decrementaVidas();
        Langosta.setLocation(20,30);
        cangrejo.setLocation(287,339);
        if(contVidas.getValue()==0)
        {
            Label et6iqutaFin = new Label("GAME OVER",50);
            addObject(etiquetaFin, 250, 250);
            Greenfoot.stop();
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Worm worm = new Worm();
        addObject(worm,365,103);
        Worm worm2 = new Worm();
        addObject(worm2,278,236);
        Worm worm3 = new Worm();
        addObject(worm3,148,164);
        Worm worm4 = new Worm();
        addObject(worm4,110,242);
        Worm worm5 = new Worm();
        addObject(worm5,175,375);
        Worm worm6 = new Worm();
        addObject(worm6,323,457);
        Worm worm7 = new Worm();
        addObject(worm7,386,397);
        Worm worm8 = new Worm();
        addObject(worm8,427,187);
        Worm worm9 = new Worm();
        addObject(worm9,502,64);
        Worm worm10 = new Worm();
        addObject(worm10,253,38);
        Worm worm11 = new Worm();
        addObject(worm11,80,119);
        Worm worm12 = new Worm();
        addObject(worm12,79,494);
        Worm worm13 = new Worm();
        addObject(worm13,500,505);
        Worm worm14 = new Worm();
        addObject(worm14,499,318);
        cangrejo = new Crab();
        addObject(cangrejo,287,339);
        Langosta = new Lobster();
        addObject(Langosta,253,130);
        contTiempo = new Counter("Tiempo: ");
        addObject(contTiempo,419,28);
        
    }
}
