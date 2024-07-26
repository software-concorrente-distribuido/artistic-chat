import mongoose, { Document, Schema } from 'mongoose';

export interface IGame extends Document {
  user1: any | null;
  points1: number;
  user2: any | null;
  points2: number;
  user1trie: boolean;
  user2trie: boolean;
  awnswer: string;
  answers: string[];
}

const gameSchema = new Schema({
  user1: { type: Schema.Types.ObjectId, ref: 'user' },
  points1: { type: Number, default: 0 },
  user2: { type: Schema.Types.ObjectId, ref: 'user' },
  points2: { type: Number, default: 0 },
  user1trie: { type: Boolean, default: false },
  user2trie: { type: Boolean, default: false },
  awnswer: { type: String },
  answers: [{ type: String }],
});

export default mongoose.model<IGame>('game', gameSchema);
