package committee.nova.encounter.event;

import committee.nova.encounter.reload.EncounterReloadListener;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ForgeEventHandler {
    @SubscribeEvent
    public static void onReload(AddReloadListenerEvent event) {
        event.addListener(new EncounterReloadListener());
    }
}
