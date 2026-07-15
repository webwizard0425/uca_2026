// lass RobotMessageTracker {
    
//     class MessageNode {
//         long timeStamp;
//         String message;
//         String status;

//         MessageNode(long timeStamp, String message) {
//             this.timeStamp = timeStamp;
//             this.message = message;
//             this.status = "ON_HOLD";
//         }
//     }

//     public Map<String, MessageNode> messageTracker;
//     public Queue<MessageNode> queue;

//     RobotMessageTracker() {
//         messageTracker = new HashMap<>();
//         queue = new LinkedList<>();
//     }

    

    
//     public void shouldPrintMessage(long timeStamp, String message ) {
        
//         MessageNode newMessage  = new MessageNode(timeStamp, message);
//         MessageNode prevMessage = messageTracker.get(message);

        

//         // Check Whether this message was in the past 

//         if (prevMessage != null && (newMessage.timeStamp - prevMessage.timeStamp) < 10) {
//             prevMessage.status = "CANCELLED";
//             newMessage.status = "CANCELLED"
//         }

//         // Hold this message for future refernce
//         messageTracker.put(message, newMessage);
//         queue.offer(newMessage);
        
//         // print All the valid Message, Time window has breached of 10 seconds.

//         while(!queue.isEmpty() && (timeStamp - q.peek().timeStamp) >= 10) {
//             Message messageFromQueue = q.poll();
//             if (messageFromQueue.status.equals("ON_HOLD") {
//                 System.out.println(messageFromQueue.timeStamp + " " + messageFromQueue.message);
//             }
//         }

//     }
// }