<?php


class Problem1
{
    public $widgetC = '10';
    public $widgetP = '20';
    public $widgetF = '0.10';
    public $widgetB = '33';

    function setSalesWidget(){
        $widgetS = 20.00 ;(P) - 20 * 0.10 ;(F) - 10.00 ;(C) ;
        return($widgetS);


    }


    function getActualWidget($widgetS){
        $this->$widgetS =$widgetS;


        $fileVar = file_get_contents('https://secure.nmi.com/hr/product_costs.txt');
        echo $fileVar;

        $lineOne = 'Line 1 : ';
        $line2 = 'Line 2: Widget soled for ';
        $line3 = 'Line 3: Widget w/ processing fee ';
        echo $lineOne + $widgetS;
        echo $line2 + $widgetS -1;
        echo $line3 + $this->widgetP;

    }


}

?>