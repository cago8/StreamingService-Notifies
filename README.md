# 🎬 StreamingService-Notifies

A sophisticated notification system for a Netflix-like streaming platform that intelligently notifies users when new movies and TV series matching their favorite genres are added.

## 🎯 Overview

StreamingService-Notifies is a Java-based application that simulates a modern streaming service ecosystem. It demonstrates the Observer design pattern by implementing a comprehensive notification system that keeps users informed about content relevant to their interests. The system manages users, media content, and automated notifications based on user preferences.

## ✨ Features

- **User Management**
  - Register users on the streaming platform
  - Prevent duplicate usernames
  - Store user device information
  - Track user preferences by device

- **Media Catalog**
  - Add movies and TV series to the platform
  - Manage media metadata (title, year, genre, duration)
  - Prevent duplicate media entries
  - Support for movies and series with detailed information

- **Smart Notifications**
  - Automatic notifications when new content matches user genres
  - Genre-based filtering system
  - Personalized notifications for each user
  - Multiple device support with unique IDs

- **Content Types**
  - **Movies:** Title, Year, Genre, Director, Duration
  - **TV Series:** Title, Year, Genre, Network, Seasons, Episodes

- **Device Management**
  - Support for multiple device types (CellPhone, PersonalComputer, Tablet)
  - Unique device identification
  - Multi-device streaming notifications

## 🛠️ Tech Stack

- **Language:** Java
- **Design Pattern:** Observer Pattern
- **Architecture:** Event-Driven Application

## 📋 Requirements

- Java Runtime Environment (JRE) 8 or higher
- Java Development Kit (JDK) for building from source

## ⚙️ Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/cago8/StreamingService-Notifies.git
   cd StreamingService-Notifies
   ```

2. **Navigate to the project directory:**
   ```bash
   cd StreamingService-Notifies
   ```

3. **Compile the project:**
   ```bash
   javac -d bin src/**/*.java
   ```

4. **Run the application:**
   ```bash
   java -cp bin Main
   ```

## 🚀 Getting Started

### Basic Usage

1. **Create Users**
   ```java
   Users user1 = new Users("Alice", Device.CellPhone, 0);
   Users user2 = new Users("Bob", Device.PersonalComputer, 1);
   ```

2. **Register Preferences**
   - Users indicate their favorite genres
   - Genres trigger notifications when new content arrives

3. **Add Media Content**
   ```java
   Movie movie = new Movie("Inception", 2010, Genre.SCIFI, "Christopher Nolan", "2h 28m");
   Series series = new Series("Stranger Things", 2016, Genre.SCIFI, "Netflix", 4, 42);
   ```

4. **Trigger Notifications**
   - When matching content is added, all subscribed users receive notifications
   - Notifications include content details and device information

## 📊 Sample Output

When the system runs, you'll see notifications like:

```
User added to the Streaming Service
Media added to the Streaming Service
--------------------------------------------------
Hey there canK,
A new SCIFI movie is added to our platform.
We thought you might like it!
--------------------------------------------------
Movie Information:
Name: Interstellar
Year: 2014
Genre: SCIFI
Director: Christopher Nolan
Duration: 2 hours and 49 minutes
--------------------------------------------------
Watch it now on your CellPhone device with the id:0
--------------------------------------------------
```

## 📁 Project Structure

```
StreamingService-Notifies/
├── src/
│   ├── Main.java              # Application entry point
│   ├── Users.java             # User class
│   ├── Device.java            # Device enumeration
│   ├── Media.java             # Abstract media class
│   ├── Movie.java             # Movie implementation
│   ├── Series.java            # TV Series implementation
│   ├── Genre.java             # Genre enumeration
│   └── StreamingService.java  # Core service logic
├── bin/                        # Compiled class files
└── README.md
```

## 🏗️ Design Pattern: Observer

This application implements the **Observer Pattern**:

- **Subject:** StreamingService (notifies users about new content)
- **Observers:** Users (receive notifications about new media)
- **Event:** Addition of new media to the platform

```
[StreamingService] ─── notifies ──→ [Users]
    ↑
    │ adds media
    │
   [Movie/Series]
```

## 🎯 Core Components

### StreamingService
- Manages the collection of users and media
- Notifies users when new content is added
- Handles subscription management

### Users
- Stores user preferences and favorite genres
- Manages device information
- Receives and displays notifications

### Media (Movies & Series)
- Abstract base class for all media content
- Concrete implementations for movies and TV series
- Contains genre and other metadata

### Genres
- Enumeration of available genres: ACTION, COMEDY, DRAMA, HORROR, SCIFI, ROMANCE, FANTASY

## 💡 How It Works

1. **Initialization:**
   - Create users with their preferences
   - Create streaming service instance

2. **Media Addition:**
   - Add movies or series to the platform
   - StreamingService checks all users' preferences

3. **Notification Trigger:**
   - For each user whose genre matches the new content
   - Generate and display a personalized notification
   - Include all relevant content details

4. **User Receives Notification:**
   - User sees notification with content details
   - User can watch on their available devices

## 🔧 Customization

### Adding New Genres
Edit `Genre.java` to add more genres:
```java
enum Genre {
    ACTION, COMEDY, DRAMA, HORROR, SCIFI, ROMANCE, FANTASY, MYSTERY, THRILLER
}
```

### Supporting New Device Types
Edit `Device.java`:
```java
enum Device {
    CellPhone, PersonalComputer, Tablet, SmartTV
}
```

### Custom Notification Format
Modify the notification message in `Users.java`

## 📈 Scalability

The application can easily be extended to:
- Support more genres and content types
- Handle real-time data from external APIs
- Implement email/SMS notifications
- Add user ratings and reviews
- Support subscription tiers
- Implement recommendation algorithms

## 🧪 Testing Scenarios

The application includes comprehensive examples:
- Multiple users with different preferences
- Movies and TV series management
- Automatic notification triggering
- Multi-device support demonstration
- Duplicate prevention (users and media)

## 🔐 Data Management

- In-memory storage of users and media
- Prevention of duplicate entries
- Clear separation of concerns

## 📝 Example Run

```
Total users registered: 3
Total media items: 5

Notifications sent when:
- New SCIFI movies arrive → Users interested in SCIFI get notified
- New COMEDY series arrive → Users interested in COMEDY get notified
- Multiple genres match → User gets multiple notifications
```

## 🤝 Contributing

We welcome contributions! To contribute:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/EnhancedNotifications`)
3. Commit your changes (`git commit -m 'Add feature'`)
4. Push to the branch (`git push origin feature/EnhancedNotifications`)
5. Open a Pull Request

## 📧 Contact

For questions or feedback:
- **Email:** [cagribilginer60@gmail.com](mailto:cagribilginer60@gmail.com)
- **GitHub:** [cago8](https://github.com/cago8)

## 📜 License

This project is open source and available under the MIT License.

## 🎓 Learning Outcomes

This project is excellent for learning:
- **Design Patterns:** Observer Pattern implementation
- **Object-Oriented Programming:** Inheritance and polymorphism
- **Event-Driven Programming:** Notifications and event handling
- **System Design:** Building scalable notification systems
- **Java Collections:** Managing users and media collections

---

**Made with ❤️ by Çağrı BİLGİNER**

*Keep your users informed! 📲*
