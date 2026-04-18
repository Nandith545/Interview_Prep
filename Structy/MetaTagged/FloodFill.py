class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        if image == None or image[sr][sc] == color:
            return image
        self.fill(image, sr, sc,image[sr][sc],color)
        return image
    
    def fill(self, image, r, c, init, color):
        if r < 0 or r >= len(image) or c < 0 or c >= len(image[0]) or image[r][c] != init:
            return
        image[r][c] = color
        self.fill(image, r+1, c, init, color)
        self.fill(image, r-1, c, init, color)
        self.fill(image, r, c+1, init, color)
        self.fill(image, r, c-1, init, color)

