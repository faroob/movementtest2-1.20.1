package net.faroob.movementtest.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;

import javax.swing.text.html.parser.Entity;

public class DashC2SPacket {
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender) {
        double pitch = player.getPitch();
        double yaw = player.getHeadYaw();
        double yaw2 = Math.abs(yaw) / yaw;
        System.out.println(yaw2);
        //System.out.println(Math.sin(yaw));
        player.velocityModified = true;
        player.addVelocity(-Math.sin(Math.toRadians(yaw)), -Math.sin(Math.toRadians(pitch)), Math.cos(Math.toRadians(yaw)));
    }
}
