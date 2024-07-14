package committee.nova.encounter;

import com.mojang.logging.LogUtils;
import committee.nova.encounter.reload.EncounterReloadListener;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.server.packs.PackType;
import org.slf4j.Logger;

public class Encounter implements ModInitializer {
    public static final String MODID = "encounter";
    public static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        ResourceManagerHelper.get(PackType.SERVER_DATA).registerReloadListener(new EncounterReloadListener());
    }
}
