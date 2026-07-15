// // class RobotMessageTracker{

// //         HashMap< String , Long> mp = new HashMap<>();
// //     public void shouldPrintMessage(long t, String s) {


// //         if(mp.containsKey(s)){
// //             long x = Math.abs(mp.get(s)-t);
// //             if(x>=10){
// //                 mp.put(s,t);
// //                 System.out.println(t + "s");
// //             }
// //         }else{
// //             mp.put(s,t);
// //             System.out.println(t + "s");
// //         }

// //     }
// // }


// #include <iostream>
// #include <bits/stdc++.h>

// using namespace std;

// class RobotMessageTracker {
// public:
//     unordered_map<string,int> mp;
//     deque<pair<string,int>> dq;
//     void shouldPrintMessage(int timestamp, string message){
        
//         while(!dq.empty() && timestamp - dq.front().second >= 10){
//             if(mp[dq.front().first] == dq.front().second){
//                 cout<<dq.front().first<<endl;
//                 cout<<dq.front().second<<endl;
//             }
//             dq.pop_front();
//         }
        
//         if(mp.find(message)==mp.end() || timestamp - mp[message] >= 10){
//             dq.push_back({message,timestamp});
//         }
        
//         mp[message]=timestamp;
//     }
// };


// int main()
// {
//     RobotMessageTracker logger;
//     logger.shouldPrintMessage(13, "foo");
//     logger.shouldPrintMessage(14, "foo");
//     logger.shouldPrintMessage(15, "foo");
//     logger.shouldPrintMessage(16, "foo");
//     logger.shouldPrintMessage(28, "foo");
//     logger.shouldPrintMessage(29, "foo");
//     logger.shouldPrintMessage(30, "foo");
//     logger.shouldPrintMessage(31, "bar");
//     logger.shouldPrintMessage(100, "bar");
// // logger.shouldPrintMessage(8, "bar");
// // logger.shouldPrintMessage(10, "foo");
// // logger.shouldPrintMessage(11, "foo");
// // logger.shouldPrintMessage(12, "bar");
// // logger.shouldPrintMessage(30, "foo");
// // logger.shouldPrintMessage(-100, "foo");
// // logger.shouldPrintMessage(0, "foo");
// // logger.shouldPrintMessage(42, "bar");
// // logger.shouldPrintMessage(53, "bar");
// // logger.shouldPrintMessage(95, "bar");
//     return 0;
// }