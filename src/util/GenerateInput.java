package util;

import com.pushpendra.model.CommittedBoy;
import com.pushpendra.model.CommittedGirl;

/**
 * Created by panther on 26/2/17.
 */
public class GenerateInput {
    /**
     * @param g
     */
    public GenerateInput(CommittedGirl[] g) {
        Util u = new Util();
        u.generateboys(1000);
        u.generategirls(1000);
        CommittedBoy[] b = new CommittedBoy[1000];
        MakeCouple M = new MakeCouple();
        M.makecouple1(b, g);
    }
}
