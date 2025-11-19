#include "box.h"

long BoxGetArea(long length, long breadth, long height)
{
	return 2 * (length * breadth + breadth * height + length * height);
}

long BoxGetVolume(long length, long breadth, long height)
{
	return length * breadth * height;
}

