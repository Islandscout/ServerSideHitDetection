# ServerSideHitDetection
ServerSideHitDetection is a Bukkit plugin designed to implement a server-side hit detection system. It is an API for plugin developers who wish to incorporate server-side hit detection to their Minecraft server.

To use this, simply clone and compile against the Bukkit API, and drop it into your plugins folder. Then, write a Bukkit plugin which listens for the Bukkit event "ServerSidePlayerHitEvent". If you are new to the Bukkit API, please visit this page for a reference on Bukkit's Event API: https://bukkit.gamepedia.com/Event_API_Reference

This plugin will cancel the EntityDamageByEntityEvent under the condition that both the damager and victim are instances of Player.
