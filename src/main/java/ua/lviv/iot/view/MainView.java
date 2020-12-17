package ua.lviv.iot.view;


import org.hibernate.Session;
import ua.lviv.iot.controller.implementation.*;
import ua.lviv.iot.model.implementation.*;

import java.sql.SQLException;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainView {
    private static final Scanner INPUT = new Scanner(System.in);
    private final AccessLevelController accessLevelController = new AccessLevelController();
    private final NotificationSettingsController notificationSettingsController = new NotificationSettingsController();
    private final ObjectAndSecurityController objectAndSecurityController = new ObjectAndSecurityController();
    private final RoomController roomController = new RoomController();
    private final SensorController sensorController = new SensorController();
    private final SensorNotificationController sensorNotificationController = new SensorNotificationController();
    private final SensorSettingsController sensorSettingsController = new SensorSettingsController();
    private final SystemAlertController systemAlertController = new SystemAlertController();
    private final SystemControlController systemControlController = new SystemControlController();
    private final UserController userController = new UserController();
    private final ZoneController zoneController = new ZoneController();


    private final Map<String, String> menu;
    private final Map<String, Printable> methodsMenu;

    public MainView(Session session) throws SQLException {
        menu = new LinkedHashMap<>();
        methodsMenu = new LinkedHashMap<>();

        menu.put("11", "11 - Get all access levels");
        menu.put("12", "12 - Get access level by ID");
        menu.put("13", "13 - Create access level");
        menu.put("14", "14 - Delete access level by ID");
        menu.put("15", "15 - Update access level by ID");

        menu.put("21", "21 - Get all notifications settings");
        menu.put("22", "22 - Get notification setting by ID");
        menu.put("23", "23 - Create notification setting");
        menu.put("24", "24 - Delete notification setting by ID");
        menu.put("25", "25 - Update notification setting by ID");

        menu.put("31", "31 - Get all objects and security");
        menu.put("32", "32 - Get object object and security by ID");
        menu.put("33", "33 - Create object object and security");
        menu.put("34", "34 - Delete object object and security by ID");
        menu.put("35", "35 - Update object object and security by ID");

        menu.put("41", "41 - Get all rooms");
        menu.put("42", "42 - Get room by ID");
        menu.put("43", "43 - Create room");
        menu.put("44", "44 - Delete room by ID");
        menu.put("45", "45 - Update room by ID");


        menu.put("51", "51 - Get all sensors");
        menu.put("52", "52 - Get sensor by ID");
        menu.put("53", "53 - Create sensor");
        menu.put("54", "54 - Delete sensor by ID");
        menu.put("55", "55 - Update sensor by ID");

        menu.put("61", "61 - Get all sensors_notification");
        menu.put("62", "62 - Get sensor_notification by ID");
        menu.put("63", "63 - Create sensor_notification");
        menu.put("64", "64 - Delete sensor_notification by ID");
        menu.put("65", "65 - Update sensor_notification by ID");

        menu.put("71", "71 - Get all sensors_settings");
        menu.put("72", "72 - Get sensor_settings by ID");
        menu.put("73", "73 - Create sensor_settings");
        menu.put("74", "74 - Delete sensor_settings by ID");
        menu.put("75", "75 - Update sensor_settings by ID");

        menu.put("81", "81 - Get all system_alerts");
        menu.put("82", "82 - Get system_alert by ID");
        menu.put("83", "83 - Create system_alert");
        menu.put("84", "84 - Delete system_alert by ID");
        menu.put("85", "85 - Update system_alert by ID");

        menu.put("91", "91 - Get all systems_control");
        menu.put("92", "92 - Get system control by ID");
        menu.put("93", "93 - Create system control");
        menu.put("94", "94 - Delete system control by ID");
        menu.put("95", "95 - Update system control by ID");

        menu.put("101", "101 - Get all users");
        menu.put("102", "102 - Get user by ID");
        menu.put("103", "103 - Create user");
        menu.put("104", "104 - Delete user by ID");
        menu.put("105", "105 - Update user by ID");

        menu.put("111", "111 - Get all zones");
        menu.put("112", "112 - Get zone by ID");
        menu.put("113", "113 - Create zone");
        menu.put("114", "114 - Delete zone by ID");
        menu.put("115", "115 - Update zone by ID");


        methodsMenu.put("11", () -> getAllAccessLevels(session));
        methodsMenu.put("12", () -> getAccessLevelById(session));
        methodsMenu.put("13", () -> createAccessLevel(session));
        methodsMenu.put("14", () -> deleteAccessLevelById(session));
        methodsMenu.put("15", () -> updateAccessLevelById(session));

        methodsMenu.put("21", () -> getAllNotificationsSettings(session));
        methodsMenu.put("22", () -> getNotificationSettingsById(session));
        methodsMenu.put("23", () -> createNotificationSettings(session));
        methodsMenu.put("24", () -> deleteNotificationSettingsById(session));
        methodsMenu.put("25", () -> updateNotificationSettingsById(session));

        methodsMenu.put("31", () -> getAllObjectsAndSecurity(session));
        methodsMenu.put("32", () -> getObjectAndSecurityById(session));
        methodsMenu.put("33", () -> createObjectAndSecurity(session));
        methodsMenu.put("34", () -> deleteObjectAndSecurityById(session));
        methodsMenu.put("35", () -> updateObjectAndSecurityById(session));

        methodsMenu.put("41", () -> getAllRooms(session));
        methodsMenu.put("42", () -> getRoomById(session));
        methodsMenu.put("43", () -> createRoom(session));
        methodsMenu.put("44", () -> deleteRoomById(session));
        methodsMenu.put("45", () -> updateRoomById(session));


        methodsMenu.put("51", () -> getAllSensors(session));
        methodsMenu.put("52", () -> getSensorById(session));
        methodsMenu.put("53", () -> createSensor(session));
        methodsMenu.put("54", () -> deleteSensorById(session));
        methodsMenu.put("55", () -> updateSensorById(session));

        methodsMenu.put("61", () -> getAllSensorsNotification(session));
        methodsMenu.put("62", () -> getSensorNotificationById(session));
        methodsMenu.put("63", () -> createSensorNotification(session));
        methodsMenu.put("64", () -> deleteSensorNotificationById(session));
        methodsMenu.put("65", () -> updateSensorNotificationById(session));

        methodsMenu.put("71", () -> getAllSensorsSettings(session));
        methodsMenu.put("72", () -> getSensorSettingsById(session));
        methodsMenu.put("73", () -> createSensorSettings(session));
        methodsMenu.put("74", () -> deleteSensorSettingsById(session));
        methodsMenu.put("75", () -> updateSensorSettingsById(session));

        methodsMenu.put("81", () -> getAllSystemAlerts(session));
        methodsMenu.put("82", () -> getSystemAlertById(session));
        methodsMenu.put("83", () -> createSystemAlert(session));
        methodsMenu.put("84", () -> deleteSystemAlertById(session));
        methodsMenu.put("85", () -> updateSystemAlertById(session));

        methodsMenu.put("91", () -> getAllSystemsControl(session));
        methodsMenu.put("92", () -> getSystemControlById(session));
        methodsMenu.put("93", () -> createSystemControl(session));
        methodsMenu.put("94", () -> deleteSystemControlById(session));
        methodsMenu.put("95", () -> updateSystemControlById(session));

        methodsMenu.put("101", () -> getAllUsers(session));
        methodsMenu.put("102", () -> getUserById(session));
        methodsMenu.put("103", () -> createUser(session));
        methodsMenu.put("104", () -> deleteUserById(session));
        methodsMenu.put("105", () -> updateUserById(session));


        methodsMenu.put("111", () -> getAllZones(session));
        methodsMenu.put("112", () -> getZoneById(session));
        methodsMenu.put("113", () -> createZone(session));
        methodsMenu.put("114", () -> deleteZoneById(session));
        methodsMenu.put("115", () -> updateZoneById(session));


    }


    private void getAllAccessLevels(Session session) throws SQLException {
        System.out.println("\nTable: access_level");
        accessLevelController.getAll(session);
    }

    private void getAccessLevelById(Session session) throws SQLException {
        System.out.println("Enter ID for access_level: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        accessLevelController.getById(id, session);
    }

    private void createAccessLevel(Session session) throws SQLException {
        System.out.println("Enter new access level range: ");
        double range = INPUT.nextDouble();
        System.out.println("Enter new access level resolution: ");
        double resolution = INPUT.nextDouble();
        INPUT.nextLine();
        AccessLevel entity = new AccessLevel(0, range, resolution);
        accessLevelController.create(entity, session);
    }

    private void deleteAccessLevelById(Session session) throws SQLException {
        System.out.println("Enter ID to delete access_level: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        accessLevelController.delete(id, session);
    }

    private void updateAccessLevelById(Session session) throws SQLException {
        System.out.println("Enter access_level id to update: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        AccessLevel oldAccessLevel = accessLevelController.getService().getById(id, session);
        System.out.println("Enter new range for access_level: ");
        double rangeSensor = INPUT.nextDouble();
        System.out.println("Enter new resolution for access_level: ");
        double resolution = INPUT.nextDouble();
        INPUT.nextDouble();

        double newRangeSensor = rangeSensor;
        double newResolution = resolution;

        if (rangeSensor < 0.0) {
            newRangeSensor = oldAccessLevel.getRangeSensor();
        }
        if (resolution < 0.0) {
            newResolution = oldAccessLevel.getResolution();
        }

        AccessLevel entity = new AccessLevel(id, newRangeSensor, newResolution);
        accessLevelController.update(entity, session);
    }


    private void getAllNotificationsSettings(Session session) throws SQLException {
        System.out.println("\nTable: notification_settings");
        notificationSettingsController.getAll(session);
    }

    private void getNotificationSettingsById(Session session) throws SQLException {
        System.out.println("Enter ID for notification_settings: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        notificationSettingsController.getById(id, session);
    }

    private void createNotificationSettings(Session session) throws SQLException {
        System.out.println("Enter new control_access_level: ");
        double controlAccessLevel = INPUT.nextDouble();
        System.out.println("Enter new system_id: ");
        int systemId = INPUT.nextInt();
        INPUT.nextLine();
        SystemControl systemControl = systemControlController.getService().getById(systemId, session);
        NotificationSettings entity = new NotificationSettings(0, controlAccessLevel, systemControl);
        notificationSettingsController.create(entity, session);
    }

    private void deleteNotificationSettingsById(Session session) throws SQLException {
        System.out.println("Enter ID to delete notification_settings: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        notificationSettingsController.delete(id, session);
    }

    private void updateNotificationSettingsById(Session session) throws SQLException {
        System.out.println("Enter notification_settings id to update: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        NotificationSettings oldNotificationSettings = notificationSettingsController.getService().getById(id, session);

        System.out.println("Enter new control_access_level for notification_settings: ");
        double controlAccessLevel = INPUT.nextDouble();
        System.out.println("Enter new system_id for notification_settings: ");
        int systemId = INPUT.nextInt();
        INPUT.nextLine();

        double newControlAccessLevel = controlAccessLevel;

        if (controlAccessLevel < 0.0) {
            newControlAccessLevel = oldNotificationSettings.getControlAccessLevel();
        }
        SystemControl systemControl = systemControlController.getService().getById(systemId, session);
        NotificationSettings entity = new NotificationSettings(id, newControlAccessLevel, systemControl);
        notificationSettingsController.update(entity, session);
    }


    private void getAllObjectsAndSecurity(Session session) throws SQLException {
        System.out.println("\nTable: object_and_security");
        objectAndSecurityController.getAll(session);
    }

    private void getObjectAndSecurityById(Session session) throws SQLException {
        System.out.println("Enter ID for object_and_security: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        objectAndSecurityController.getById(id, session);
    }

    private void createObjectAndSecurity(Session session) throws SQLException {
        System.out.println("Enter new ID for location: ");
        String location = INPUT.nextLine();
        INPUT.nextLine();
        ObjectAndSecurity entity = new ObjectAndSecurity(0, location);
        objectAndSecurityController.create(entity, session);
    }

    private void deleteObjectAndSecurityById(Session session) throws SQLException {
        System.out.println("Enter ID to delete object_and_security: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        objectAndSecurityController.delete(id, session);
    }

    private void updateObjectAndSecurityById(Session session) throws SQLException {
        System.out.println("Enter object_and_security ID to update: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        ObjectAndSecurity oldObjectAndSecurity = objectAndSecurityController.getService().getById(id, session);
        System.out.println("Enter new location for object_and_security: ");
        String location = INPUT.nextLine();
        INPUT.nextLine();

        String newLocation = location;

        if (location.equals("")) {
            newLocation = oldObjectAndSecurity.getLocation();
        }

        ObjectAndSecurity entity = new ObjectAndSecurity(0, newLocation);
        objectAndSecurityController.update(entity, session);
    }


    private void getAllRooms(Session session) throws SQLException {
        System.out.println("\nTable: room");
        roomController.getAll(session);
    }

    private void getRoomById(Session session) throws SQLException {
        System.out.println("Enter ID for room: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        roomController.getById(id, session);
    }

    private void createRoom(Session session) throws SQLException {
        System.out.println("Enter new name_room: ");
        String nameRoom = INPUT.nextLine();
        System.out.println("Enter new square: ");
        double square = INPUT.nextDouble();
        INPUT.nextLine();
        Room entity = new Room(0, nameRoom, square);
        roomController.create(entity, session);
    }

    private void deleteRoomById(Session session) throws SQLException {
        System.out.println("Enter ID to delete room: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        roomController.delete(id, session);
    }

    private void updateRoomById(Session session) throws SQLException {
        System.out.println("Enter room ID to update: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        Room oldRoom = roomController.getService().getById(id, session);
        System.out.println("Enter new for name_room: ");
        String nameRoom = INPUT.nextLine();
        System.out.println("Enter new for square: ");
        double square = INPUT.nextDouble();
        INPUT.nextLine();

        String newNameRoom = nameRoom;
        double newSquare = square;


        if (nameRoom.equals("")) {
            newNameRoom = oldRoom.getNameRoom();
        }
        if (square < 0.0) {
            newSquare = oldRoom.getSquare();
        }

        Room entity = new Room(id, newNameRoom, newSquare);
        roomController.update(entity, session);
    }

    private void getAllSensorsNotification(Session session) throws SQLException {
        System.out.println("\nTable: sensor_notification");
        sensorNotificationController.getAll(session);
    }

    private void getSensorNotificationById(Session session) throws SQLException {
        System.out.println("Enter ID for sensor_notification: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        sensorNotificationController.getById(id, session);
    }

    private void createSensorNotification(Session session) throws SQLException {
        System.out.println("Enter new range_level: ");
        double rangeLevel = INPUT.nextDouble();
        System.out.println("Enter new resolution_level: ");
        double resolutionLevel = INPUT.nextDouble();
        System.out.println("Enter new system_id: ");
        int systemId = INPUT.nextInt();
        INPUT.nextLine();
        SystemControl systemControl = systemControlController.getService().getById(systemId, session);
        SensorNotification entity = new SensorNotification(0, rangeLevel, resolutionLevel, systemControl);
        sensorNotificationController.create(entity, session);
    }

    private void deleteSensorNotificationById(Session session) throws SQLException {
        System.out.println("Enter ID to delete sensor_notification: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        sensorNotificationController.delete(id, session);
    }

    private void updateSensorNotificationById(Session session) throws SQLException {
        System.out.println("Enter sensor_notification ID to update: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        SensorNotification oldSensorNotification = sensorNotificationController.getService().getById(id, session);
        System.out.println("Enter new range_level: ");
        double rangeLevel = INPUT.nextDouble();
        System.out.println("Enter new resolution_level: ");
        double resolutionLevel = INPUT.nextDouble();
        System.out.println("Enter new system_Id: ");
        int systemId = INPUT.nextInt();
        INPUT.nextLine();

        double newRangeLevel = rangeLevel;
        double newResolutionLevel = resolutionLevel;

        if (rangeLevel < 0.0) {
            newRangeLevel = oldSensorNotification.getRangeLevel();
        }
        if (resolutionLevel < 0.0) {
            newResolutionLevel = oldSensorNotification.getResolutionLevel();
        }
        SystemControl systemControl = systemControlController.getService().getById(systemId, session);
        SensorNotification entity = new SensorNotification(id, newRangeLevel, newResolutionLevel, systemControl);
        sensorNotificationController.update(entity, session);
    }


    private void getAllSensors(Session session) throws SQLException {
        System.out.println("\nTable: sensor");
        sensorController.getAll(session);
    }

    private void getSensorById(Session session) throws SQLException {
        System.out.println("Enter ID for sensor: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        sensorController.getById(id, session);
    }

    private void createSensor(Session session) throws SQLException {
        System.out.println("Enter new processings_time: ");
        double processingTime = INPUT.nextDouble();
        System.out.println("Enter new name_model: ");
        String nameModel = INPUT.nextLine();
        System.out.println("Enter new type_sensor: ");
        String type = INPUT.nextLine();
        System.out.println("Enter new calibration: ");
        int calibration = INPUT.nextInt();
        System.out.println("Enter new classification: ");
        String classification = INPUT.nextLine();
        INPUT.nextLine();
        Sensor entity = new Sensor(0, processingTime, nameModel, type, calibration, classification);
        sensorController.create(entity, session);
    }

    private void deleteSensorById(Session session) throws SQLException {
        System.out.println("Enter ID to delete Sensor: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        sensorController.delete(id, session);
    }

    private void updateSensorById(Session session) throws SQLException {
        System.out.println("Enter Sensor ID to update: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        Sensor oldSensor = sensorController.getService().getById(id, session);
        System.out.println("Enter new processing_time: ");
        double processingTime = INPUT.nextDouble();
        System.out.println("Enter new name_model: ");
        String nameModel = INPUT.nextLine();
        System.out.println("Enter new type_sensor: ");
        String type = INPUT.nextLine();
        System.out.println("Enter new calibration: ");
        int calibration = INPUT.nextInt();
        System.out.println("Enter new classification: ");
        String classification = INPUT.nextLine();
        INPUT.nextLine();

        double newProcessingTime = processingTime;
        String newNameModel = nameModel;
        String newType = type;
        int newCalibration = calibration;
        String newClassification = classification;


        if (processingTime < 0.0) {
            newProcessingTime = oldSensor.getProcessingTime();
        }
        if (nameModel.equals("")) {
            newNameModel = oldSensor.getNameModel();
        }
        if (type.equals("")) {
            newType = oldSensor.getTypeSensor();
        }
        if (calibration < 0.0) {
            newCalibration = oldSensor.getCalibration();
        }
        if (classification.equals("")) {
            newClassification = oldSensor.getClassification();
        }

        Sensor entity = new Sensor(id, newProcessingTime, newNameModel, newType, newCalibration, newClassification);
        sensorController.update(entity, session);
    }


    private void getAllSensorsSettings(Session session) throws SQLException {
        System.out.println("\nTable: sensor_settings");
        sensorSettingsController.getAll(session);
    }

    private void getSensorSettingsById(Session session) throws SQLException {
        System.out.println("Enter ID for sensor_settings: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        sensorSettingsController.getById(id, session);
    }

    private void createSensorSettings(Session session) throws SQLException {
        System.out.println("Enter new sensor_range: ");
        double sensorRange = INPUT.nextDouble();
        System.out.println("Enter new sensor_resolution: ");
        double sensorResolution = INPUT.nextDouble();
        System.out.println("Enter new system_id: ");
        Integer systemId = INPUT.nextInt();
        INPUT.nextLine();
        SystemControl systemControl = systemControlController.getService().getById(systemId, session);
        SensorSettings entity = new SensorSettings(0, sensorRange, sensorResolution, systemControl);
        sensorSettingsController.create(entity, session);
    }

    private void deleteSensorSettingsById(Session session) throws SQLException {
        System.out.println("Enter ID to delete sensor_settings: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        sensorSettingsController.delete(id, session);
    }

    private void updateSensorSettingsById(Session session) throws SQLException {
        System.out.println("Enter sensor_settings id to update: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        SensorSettings oldSensorSetting = sensorSettingsController.getService().getById(id, session);
        System.out.println("Enter new ID for sensor_range: ");
        double sensorRange = INPUT.nextDouble();
        System.out.println("Enter ID status for sensor_resolution: ");
        double sensorResolution = INPUT.nextDouble();
        System.out.println("Enter new ID for system_id: ");
        int systemId = INPUT.nextInt();
        INPUT.nextLine();

        double newSensorRange = sensorRange;
        double newSensorResolution = sensorResolution;

        if (sensorRange < 0.0) {
            newSensorRange = oldSensorSetting.getSensorRange();
        }
        if (sensorResolution < 0.0) {
            newSensorResolution = oldSensorSetting.getSensorResolution();
        }
        SystemControl systemControl = systemControlController.getService().getById(systemId, session);
        SensorSettings entity = new SensorSettings(id, newSensorRange, newSensorResolution, systemControl);
        sensorSettingsController.update(entity, session);
    }


    private void getAllSystemAlerts(Session session) throws SQLException {
        System.out.println("\nTable: system_alert");
        systemAlertController.getAll(session);
    }

    private void getSystemAlertById(Session session) throws SQLException {
        System.out.println("Enter ID for system_alert: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        systemAlertController.getById(id, session);
    }

    private void createSystemAlert(Session session) throws SQLException {
        System.out.println("Enter new many_notifications: ");
        int manyNotifications = INPUT.nextInt();
        System.out.println("Enter new texts_notifications: ");
        String textsNotifications = INPUT.nextLine();
        System.out.println("Enter new about_processings: ");
        String aboutProcessings = INPUT.nextLine();
        System.out.println("Enter new system_id: ");
        int systemId = INPUT.nextInt();
        INPUT.nextLine();
        SystemControl systemControl = systemControlController.getService().getById(systemId, session);
        SystemAlert entity = new SystemAlert(0, manyNotifications, textsNotifications, aboutProcessings, systemControl);
        systemAlertController.create(entity, session);
    }

    private void deleteSystemAlertById(Session session) throws SQLException {
        System.out.println("Enter ID to delete system_alert: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        systemAlertController.delete(id, session);
    }

    private void updateSystemAlertById(Session session) throws SQLException {
        System.out.println("Enter system_alert id to update: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        SystemAlert oldSystemAlert = systemAlertController.getService().getById(id, session);
        System.out.println("Enter new many_notifications: ");
        int manyNotifications = INPUT.nextInt();
        System.out.println("Enter new texts_notifications: ");
        String textsNotifications = INPUT.nextLine();
        System.out.println("Enter new about_processings: ");
        String aboutProcessings = INPUT.nextLine();
        System.out.println("Enter new system_id: ");
        int systemId = INPUT.nextInt();
        INPUT.nextLine();

        int newManyNotifications = manyNotifications;
        String newTextsNotifications = textsNotifications;
        String newAboutProcessings = aboutProcessings;


        if (manyNotifications < 0) {
            newManyNotifications = oldSystemAlert.getManyNotifications();
        }
        if (textsNotifications.equals("")) {
            newTextsNotifications = oldSystemAlert.getTextsNotifications();
        }
        if (aboutProcessings.equals("")) {
            newAboutProcessings = oldSystemAlert.getAboutProcessings();
        }

        SystemControl systemControl = systemControlController.getService().getById(systemId, session);
        SystemAlert entity = new SystemAlert(id, newManyNotifications, newTextsNotifications, newAboutProcessings, systemControl);
        systemAlertController.update(entity, session);
    }


    private void getAllSystemsControl(Session session) throws SQLException {

        System.out.println("\nTable: system_control");
        systemControlController.getAll(session);
    }

    private void getSystemControlById(Session session) throws SQLException {
        System.out.println("Enter ID for system_control: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        systemControlController.getById(id, session);
    }

    private void createSystemControl(Session session) throws SQLException {
        System.out.println("Enter new quantity_control_processings: ");
        int quantityControlProcessings = INPUT.nextInt();
        INPUT.nextLine();
        SystemControl entity = new SystemControl(0, quantityControlProcessings);
        systemControlController.create(entity, session);
    }

    private void deleteSystemControlById(Session session) throws SQLException {
        System.out.println("Enter ID to delete system_control: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        systemControlController.delete(id, session);
    }

    private void updateSystemControlById(Session session) throws SQLException {
        System.out.println("Enter system_control ID to update: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        SystemControl oldSystemControl = systemControlController.getService().getById(id, session);
        System.out.println("Enter new quantity_control_processings: ");
        int quantityControlProcessings = INPUT.nextInt();
        INPUT.nextLine();

        int newQuantityControlProcessings = quantityControlProcessings;

        if (quantityControlProcessings < 0) {
            newQuantityControlProcessings = oldSystemControl.getQuantityControlProcessings();
        }

        SystemControl entity = new SystemControl(id, newQuantityControlProcessings);
        systemControlController.update(entity, session);
    }


    private void getAllUsers(Session session) throws SQLException {
        System.out.println("\nTable: user");
        userController.getAll(session);
    }

    private void getUserById(Session session) throws SQLException {
        System.out.println("Enter ID for user: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        userController.getById(id, session);
    }

    private void createUser(Session session) throws SQLException {
        System.out.println("Enter new first_name: ");
        String firstName = INPUT.nextLine();
        System.out.println("Enter new last_name: ");
        String lastName = INPUT.nextLine();
        System.out.println("Enter new country: ");
        String country = INPUT.nextLine();
        System.out.println("Enter new system_id: ");
        int systemId = INPUT.nextInt();
        INPUT.nextLine();
        SystemControl systemControl = systemControlController.getService().getById(systemId, session);
        User entity = new User(0, firstName, lastName, country, systemControl);
        userController.create(entity, session);
    }

    private void deleteUserById(Session session) throws SQLException {
        System.out.println("Enter ID to delete user: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        userController.delete(id, session);
    }

    private void updateUserById(Session session) throws SQLException {
        System.out.println("Enter user ID to update: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        User oldUser = userController.getService().getById(id, session);
        System.out.println("Enter new first_name: ");
        String firstName = INPUT.nextLine();
        System.out.println("Enter new last_name: ");
        String lastName = INPUT.nextLine();
        System.out.println("Enter new country: ");
        String country = INPUT.nextLine();
        System.out.println("Enter new system_id: ");
        int systemId = INPUT.nextInt();
        INPUT.nextLine();

        String newFirstName = firstName;
        String newLastName = lastName;
        String newCountry = country;

        if (firstName.equals("")) {
            newFirstName = oldUser.getFirstName();
        }
        if (lastName.equals("")) {
            newLastName = oldUser.getLastName();
        }
        if (country.equals("")) {
            newCountry = oldUser.getCountry();
        }

        SystemControl systemControl = systemControlController.getService().getById(systemId, session);
        User entity = new User(id, newFirstName, newLastName, newCountry, systemControl);
        userController.update(entity, session);
    }


    private void getAllZones(Session session) throws SQLException {
        System.out.println("\nTable: zone");
        zoneController.getAll(session);
    }

    private void getZoneById(Session session) throws SQLException {
        System.out.println("Enter ID for zone: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        zoneController.getById(id, session);
    }

    private void createZone(Session session) throws SQLException {
        System.out.println("Enter new quantity_rooms: ");
        int quantityRooms = INPUT.nextInt();
        System.out.println("Enter new level_range: ");
        double levelRange = INPUT.nextDouble();
        INPUT.nextLine();
        Zone entity = new Zone(0, quantityRooms, levelRange);
        zoneController.create(entity, session);
    }

    private void deleteZoneById(Session session) throws SQLException {
        System.out.println("Enter ID to delete zone: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        zoneController.delete(id, session);
    }

    private void updateZoneById(Session session) throws SQLException {
        System.out.println("Enter zone id to update: ");
        int id = INPUT.nextInt();
        INPUT.nextLine();
        Zone oldZone = zoneController.getService().getById(id, session);
        System.out.println("Enter new quantity_rooms: ");
        int quantityRooms = INPUT.nextInt();
        System.out.println("Enter new level_range: ");
        double levelRange = INPUT.nextDouble();
        INPUT.nextLine();

        int newQuantityRooms = quantityRooms;
        double newLevelRange = levelRange;

        if (quantityRooms < 0) {
            newQuantityRooms = oldZone.getQuantityRooms();
        }
        if (levelRange < 0) {
            newLevelRange = oldZone.getLevelRange();
        }

        Zone entity = new Zone(id, newQuantityRooms, newLevelRange);
        zoneController.update(entity, session);
    }

    private void outputMenu() {
        System.out.println("\nMENU:");
        for (String str : menu.values()) {
            System.out.println(str);
        }
    }

    public final void show() {
        String keyMenu;
        do {
            outputMenu();
            System.out.println("Please, select menu point.");
            keyMenu = INPUT.nextLine().toUpperCase();
            try {
                methodsMenu.get(keyMenu).print();
            } catch (Exception ignored) {
            }
        } while (!keyMenu.equals("Q"));
    }
}