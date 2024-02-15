package OOPAssignment.PhoneBook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PersonApp extends JFrame {
    private ArrayList<Person> personList = new ArrayList<>();

    private JTextField nameInput, addressInput, numberInput, searchInput;
    private JTextArea displayArea;

    public PersonApp() {
        setTitle("Person App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);

        JLabel nameLabel = new JLabel("Name:");
        nameInput = new JTextField(20);

        JLabel addressLabel = new JLabel("Address:");
        addressInput = new JTextField(20);

        JLabel numberLabel = new JLabel("Phone Number:");
        numberInput = new JTextField(20);

        JButton addButton = new JButton("Add Contact");
        addButton.addActionListener(new AddContactListener());

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ClearListener());

        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(new SearchListener());

        JButton showPhoneBookButton = new JButton("Show PhoneBook");
        showPhoneBookButton.addActionListener(new ShowPhoneBookListener());

        displayArea = new JTextArea(10, 30);
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        searchInput = new JTextField(20);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(nameInput, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(addressLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(addressInput, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(numberLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(numberInput, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        add(searchInput, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(addButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(clearButton, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        add(searchButton, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        add(showPhoneBookButton, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        add(scrollPane, gbc);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class AddContactListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameInput.getText();
            String address = addressInput.getText();
            String number = numberInput.getText();

            if (!name.isEmpty() && !address.isEmpty() && !number.isEmpty()) {
                Person newPerson = new Person(personList.size() + 1, name, address, number);
                personList.add(newPerson);
                displayArea.append(newPerson + "\n");
                clearInputs();
            } else {
                displayArea.append("Please enter name, address, and phone number.\n");
            }
        }
    }

    private class ClearListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clearInputs();
            displayArea.setText("");
        }
    }

    private class SearchListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nameToSearch = searchInput.getText().trim();

            if (nameToSearch.isEmpty()) {
                displayArea.append("Search field empty. Please enter a name to search.\n");
            } else {
                boolean contactFound = false;

                for (Person person : personList) {
                    if (person.getName().equalsIgnoreCase(nameToSearch)) {
                        displayArea.append("Contact found: " + person + "\n");
                        contactFound = true;
                        break;
                    }
                }

                if (!contactFound) {
                    displayArea.append("Contact not found\n");
                }
            }
        }
    }

    private class ShowPhoneBookListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //displayArea.setText("PhoneBook Entries:\n");
            for (Person person : personList) {
                displayArea.append(person + "\n");
            }
        }
    }

    private void clearInputs() {
        nameInput.setText("");
        addressInput.setText("");
        numberInput.setText("");
    }

    public static void main(String[] args) {
        new PersonApp();
    }
}
