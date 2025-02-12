package nl.tue.s2id90.group65;

import nl.tue.s2id90.group65.samples.UninformedPlayer;
import nl.tue.s2id90.group65.samples.OptimisticPlayer;
import nl.tue.s2id90.group65.samples.BuggyPlayer;
import net.xeoh.plugins.base.annotations.PluginImplementation;
import nl.tue.s2id90.draughts.DraughtsPlayerProvider;
import nl.tue.s2id90.draughts.DraughtsPlugin;



/**
 *
 * @author huub
 */
@PluginImplementation
public class AlphaAndOmegaPluginv1 extends DraughtsPlayerProvider implements DraughtsPlugin {
    public AlphaAndOmegaPluginv1() {
        // make one or more players available to the AICompetition tool
        // During the final competition you should make only your 
        // best player available. For testing it might be handy
        // to make more than one player available.
        super(new AlphaAndOmegav1());
    }
}
