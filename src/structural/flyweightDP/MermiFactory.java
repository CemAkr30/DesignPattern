package structural.flyweightDP;

import java.util.HashMap;
import java.util.Map;

public class MermiFactory
{

    private static Map<EnumMermiBoyutu,Mermi> mermiMap = new HashMap<>();


    public static Mermi   mermiUret(EnumMermiBoyutu mermiBoyutu)
    {
        Mermi mermi = mermiMap.get(mermiBoyutu);

        if(mermi == null)
        {
            mermi = new Mermi(mermiBoyutu);
            mermiMap.put(mermiBoyutu, mermi);
        }

        return mermi;
    }
}
