// 올바른 괄호(스택)
// 스택은 따로없고 배열의 push/pop을 이용
// 큐는 따로없고 배열의 push/shift를 이용
function solution(s) {
    let stack = [];

    for (let i = 0; i < s.length; i++) {
        if (stack.length == 0) {
            stack.push(s[i]);
        } else if (s[i] == ')' && stack[0] == '(') {
            stack.pop();
        } else {
            stack.push(s[i]);
        }
    }
    // 비었다면 참, 아니라면 거짓
    if (stack.length == 0) return true;
    return false;
}