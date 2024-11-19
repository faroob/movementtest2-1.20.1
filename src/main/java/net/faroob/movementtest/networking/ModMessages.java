package net.faroob.movementtest.networking;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.faroob.movementtest.MovementTest2;
import net.faroob.movementtest.networking.packet.DashC2SPacket;
import net.minecraft.util.Identifier;

public class ModMessages {
    public static final Identifier DASH_ID = new Identifier(MovementTest2.MOD_ID, "dash");
    public static final Identifier SLIDE_ID = new Identifier(MovementTest2.MOD_ID, "slide");
    public static final Identifier SLAM_ID = new Identifier(MovementTest2.MOD_ID, "slam");

    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(DASH_ID, DashC2SPacket::receive);
    }

    public static void registerS2CPackets() {

    }
}
