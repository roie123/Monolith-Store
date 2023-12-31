﻿# Monolith-Store
# API Scalability Showcase

Welcome to the API Scalability Showcase repository! In this project, we delve into the fascinating world of API scalability. We'll take you on a journey through the principles of scaling APIs and showcase practical examples using a simple online store application. This repository aligns with the concepts outlined in "The Art of Scalability" book, providing hands-on demonstrations of scaling along the X-axis, Y-axis, and Z-axis.

## Table of Contents

- [Introduction](#introduction)
- [Scalability Types](#scalability-types)
  - [X-axis Scaling](#x-axis-scaling)
  - [Y-axis Scaling](#y-axis-scaling)
  - [Z-axis Scaling](#z-axis-scaling)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

In today's dynamic digital landscape, where user demands can surge unexpectedly, the ability of an application to scale seamlessly is crucial. Scalability is the art of engineering systems to gracefully handle increasing loads, ensuring optimal performance without compromising user experience. The API Scalability Showcase provides an interactive platform to understand and explore three prominent scalability strategies.

## Scalability Types

### X-axis Scaling

X-axis scaling, often referred to as horizontal scaling, involves expanding the capacity of your application by adding more instances. Imagine our online store as a bustling marketplace. As the customer base grows, adding more cash registers (instances) helps manage the increased demand. We'll demonstrate how to horizontally scale our store application by deploying multiple identical instances, each catering to incoming requests, all balanced by a load balancer.

### Y-axis Scaling

Y-axis scaling, known as vertical scaling, centers on enhancing the resources of a single instance to handle escalating workloads. Picture our store as a single mega-mall. When more customers arrive, increasing the number of floors (upgrading hardware) accommodates the influx. We'll showcase vertical scalability by optimizing our store application to harness greater processing power, memory, and resources.

### Z-axis Scaling

Z-axis scaling, also known as functional partitioning, is akin to creating specialized boutique shops within a larger shopping complex. Differentiating based on product categories, each boutique (partition) serves a distinct purpose while contributing to the overall experience. In our store, we'll partition the application, isolating core functionalities into separate instances. This approach enables independent scaling of specific features while maintaining the coherence of the store.

## Getting Started

Embark on your journey to grasp the intricacies of API scalability:

1. **Clone the Repository:** Start by cloning this repository to your local machine.
2. **Explore Scalability Types:** Navigate to the relevant directories to discover comprehensive instructions, code samples, and configuration details for each scalability type.
3. **Experiment and Learn:** Engage with provided code and configurations to visualize the impact of each scalability strategy.

## Usage

Each scalability type unfolds within its dedicated directory:

- `x-axis-scaling`: Dive into horizontal scaling and gain insights into distributing the load across multiple instances behind a load balancer.
- `y-axis-scaling`: Explore vertical scaling techniques and learn how to optimize an individual instance for greater performance.
- `z-axis-scaling`: Delve into functional partitioning and witness how distinct application components can scale independently.

Refer to the README in each directory for explicit usage guidelines and real-world examples.

## Contributing

We believe in collaborative growth and welcome contributions to enrich this showcase! Whether you have ideas, bug fixes, or novel scalability approaches, your input is invaluable. Feel free to open issues or submit pull requests to engage with the community.

## License

This project operates under the [MIT License](LICENSE). We encourage you to explore, learn, and share as you see fit.
