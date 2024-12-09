package com.example.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.model.Client;

public class ClientDBService {

//CRUD operations here

// Static list to hold Client objects
	private static List<Client> clients = new ArrayList<Client>();

	public static void initialize() {
		clients.add(new Client("Ahmad", 70.5, 1.70));
		clients.add(new Client("Aisyah", 55.0, 1.60));
		clients.add(new Client("Syafiq", 80.0, 1.75));
		clients.add(new Client("Nurul", 62.0, 1.65));
		clients.add(new Client("Hafiz", 85.0, 1.78));
		clients.add(new Client("Farah", 50.0, 1.55));
		clients.add(new Client("Zul", 90.0, 1.52));
		clients.add(new Client("Siti", 58.0, 1.63));
	}

// Method to add a client to the list
	public static void add(Client client) {
		clients.add(client);
	}

// Method to retrieve all clients
	public static List<Client> getClients() {
		return new ArrayList<Client>(clients); // Return a copy to avoid modification
	}

// Method to find a client by name
	public static Client getClientDetail(String name) {
		for (Client client : clients) {
			if (client.getName().equalsIgnoreCase(name)) {
				return client; // Return the client if the name matches
			}
		}
		return null; // Return null if no matching client is found
	}

// Method to delete a client by name
	public static boolean delete(String name) {
		Iterator<Client> iterator = clients.iterator();
		while (iterator.hasNext()) {
			Client client = iterator.next();
			if (client.getName().equalsIgnoreCase(name)) {
				iterator.remove(); // Remove the client if the name matches
				return true; // Return true to indicate successful deletion
			}
		}
		return false; // Return false if no matching client is found
	}

// Method to clear the client list (optional)
	public static void clearClients() {
		clients.clear();
	}
}