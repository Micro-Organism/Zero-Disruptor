# Zero-Disruptor
Zero-Disruptor

# 1. 概述
## 1.1. 简介
- Disruptor 是英国外汇交易公司 LMAX 开发的一个高性能的并发框架。可以认为是线程间通信的高效低延时的内存消息组件，它最大的特点是高性能。
与 Kafka、RabbitMQ 用于服务间的消息队列不同，disruptor 一般用于一个 JVM 中多个线程间消息的传递。
- 从功能上来看，Disruptor 实现了“队列”的功能，而且是一个有界队列（事实上它是一个无锁的线程间通信库）。
作用与 ArrayBlockingQueue 有相似之处，但是 disruptor 从功能、性能上又都远好于 ArrayBlockingQueue。

## 1.2. 特点
- Disruptor 最直接的应用场景自然就是“生产者-消费者”模型的应用场合了，虽然这些我们使用 JDK 的 BlockingQueue 也能做到，
但 Disruptor 的性能比 BlockingQueue 提高了 5~10 倍左右：
- 也就是说 BlockingQueue 能做的，Disruptor 都能做到且做的更好。同时 Disruptor 还能做得更多。

# 2. 功能

# 3. 使用
## 3.1. 测试
1. 启动Spring Boot应用服务
2. 浏览器输入：http://127.0.0.1:8080/disruptor/send?message=hello%20world
3. 控制台输出日志

# 4. 其他

# 5. 参考