# Lanes Intersection Project

This project focuses on developing a **Distributed Control System** for managing traffic at intersections. The system models traffic flow, evaluates control strategies, and simulates traffic scenarios using **Object Enhanced Time Petri Nets (OETPNs)** to prevent congestion and ensure optimal traffic management.

## Features

- **Traffic Flow Simulation**: Simulates the movement of vehicles through multiple intersections, taking into account traffic lights, lanes, and car queues.
- **Dynamic Traffic Light Control**: Adjusts the duration of traffic lights dynamically based on real-time traffic conditions and potential jams.
- **Petri Net Modeling**: Uses Petri Nets to model concurrent traffic processes and analyze the system's behavior.
- **Safety Assessment**: Models various scenarios to evaluate the safety of intersections and identify potential hazards.
- **Optimization**: The system is capable of adjusting parameters to improve traffic flow and reduce congestion at the intersections.

## Project Objectives

1. **Traffic Flow Analysis**: Simulate how vehicles move through intersections, considering traffic lights, lanes, and the presence of cars in different areas.
2. **Control Strategy Evaluation**: Test different traffic light timing strategies and lane prioritization to optimize intersection efficiency.
3. **Safety Assessment**: Use the simulation to assess the safety of intersections under various conditions.
4. **Traffic Management Optimization**: Optimize traffic management to improve flow and reduce congestion through dynamic adjustments.
5. **Urban Planning Insights**: Provide insights into how different intersection designs affect overall traffic flow and safety.
6. **Real-world Scenarios**: Simulate real-world traffic scenarios to evaluate intersection behavior under different conditions.

## How It Works

1. **Controllers**: The project includes a closed-loop controller for each intersection. Each controller manages traffic flow by receiving input from sensors (representing vehicle arrivals) and controlling traffic lights accordingly.
    - **Controller2F1.java**: Manages traffic flow and signal lights for the first intersection.
    - **Controller2F2.java**: Manages traffic flow and signal lights for the second intersection.
    
2. **Intersections Class**: The `Intersections2.java` class represents real-world actions happening at the intersections. It simulates car movement, car queues, and interactions between vehicles and traffic signals.

3. **Dynamic Delays**: The system extends green light durations dynamically in case of detected traffic jams.

4. **Petri Nets**: Petri Nets are used to model the traffic system, where:
    - **Places** represent different areas within the intersection, such as lanes, exits, or waiting areas.
    - **Transitions** model events like cars moving through intersections or traffic lights changing.
    - **Conditions** are used to define when transitions can happen, such as the presence of cars or the status of traffic lights.

## Key Components

- **Controller2F1.java**: 
    - Controls traffic flow for the first intersection.
    - Uses Petri Nets to manage traffic lights and vehicle movements.
    - Features dynamic delays based on traffic jams.

- **Controller2F2.java**: 
    - Similar to `Controller2F1`, but manages the second intersection.
    - Handles transitions and manages network communication for signals.

- **Intersections2.java**:
    - Models the real-world interaction between vehicles and traffic lights at intersections.
    - Simulates car movements and traffic flow based on real-time conditions.

## Installation and Setup

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/lanes-intersection-project.git
    cd lanes-intersection-project
    ```

2. **Compile the Java classes**:
    ```bash
    javac Controller2F1.java Controller2F2.java Intersections2.java
    ```

3. **Run the system**:
    ```bash
    java Controller2F1
    java Controller2F2
    java Intersections2
    ```

## Testing

Two key scenarios were tested in this project:

1. **Standard Traffic Flow**: Cars are sent from the first intersection, go through the middle street, and exit from one of the second intersection's lanes. This simulates typical traffic flow through the intersection system.
2. **Traffic Jam Simulation**: Maximum cars are sent to the input lane of an intersection to simulate a traffic jam. The controller adjusts the traffic light delays dynamically to handle the congestion.

## Results

The following outcomes were observed from testing:

- **Efficient Traffic Management**: The system successfully manages traffic by adjusting light timings based on real-time conditions.
- **Dynamic Congestion Handling**: Traffic jams are handled efficiently with the dynamic delay feature, reducing wait times.
- **Accurate Simulation**: The Petri Net models provide an accurate simulation of real-world traffic conditions and help evaluate different traffic strategies.

## Customization

- **Network Ports**: You can modify the network ports for communication in the Java files to suit your environment.
- **Traffic Light Delays**: Adjust the default delay times for traffic lights in `Controller2F1` and `Controller2F2` as needed.


## Acknowledgments

- **Object Enhanced Time Petri Nets (OETPN)**: For providing the framework for modeling the traffic system.
- **Java TCP Sockets**: For enabling network-based communication between different controllers.
