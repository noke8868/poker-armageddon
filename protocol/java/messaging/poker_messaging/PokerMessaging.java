package poker_messaging;

final const LENGTH_BYTES = 4;

/*
def receive_message(f, message_class):
    # get a message of the specified type from the input stream, return true
    # on success, false on failure
    length = f.read(LENGTH_BYTES)
    if len(length) < LENGTH_BYTES:
        raise Exception("Unexpected end of stream while reading length")
        
    bytes = 0
    for c in length:
        bytes <<= 8
        bytes |= ord(c)
    
    message_str = f.read(bytes)
    if len(message_str) < bytes:
        raise Exception("Unexpected end of stream while reading message")
    
    message = message_class()
    message.ParseFromString(message_str)
    return message
        
def send_message(f, message):
    # convert the action into a string
    s = message.SerializeToString()
    bytes = len(s)
    for i in reversed(range(LENGTH_BYTES)):
        byte = (bytes >> 8*i) & 0xFF
        f.write(chr(byte))
    f.write(s)
    f.flush()
    
def send_terminator(f):
    # terminate a stream
    for i in range(LENGTH_BYTES):
      f.write(chr(0))
*/
      
public final class PokerMessaging {
  private PokerMessaging() {}
}

/*
import java.io.*;

class StdinParser {

    public static void main(String[] args) {
        byte[] byteBuf = new byte[4];

        System.out.print("Input 4 bytes to be parsed as a 32 bit Integer: ");
        try {
            DataInputStream dis = new DataInputStream(System.in);
            int givenInt = dis.readInt();

            System.out.println("I read " + givenInt + " from you.");                
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/