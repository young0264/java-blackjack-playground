## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
**기능 요구 사항**
```

* 블랙잭 게임을 변형한 프로그램을 구현한다. 블랙잭 게임은 딜러와 플레이어 중 카드의 합이 21 또는 21에 가장 가까운 숫자를 가지는 쪽이 이기는 게임이다.
플레이어는 게임을 시작할 때 배팅 금액을 정해야 한다.

* 카드의 숫자 계산은 카드 숫자를 기본으로 하며, 예외로 Ace는 1 또는 11로 계산할 수 있으며, King, Queen, Jack은 각각 10으로 계산한다.
* 게임을 시작하면 플레이어는 두 장의 카드를 지급 받으며, 두 장의 카드 숫자를 합쳐 21을 초과하지 않으면서 21에 가깝게 만들면 이긴다. 
21을 넘지 않을 경우 원한다면 얼마든지 카드를 계속 뽑을 수 있다. 
단, 카드를 추가로 뽑아 21을 초과할 경우 배팅 금액을 모두 잃게 된다.
처음 두 장의 카드 합이 21일 경우 블랙잭이 되면 베팅 금액의 1.5 배를 딜러에게 받는다. 
딜러와 플레이어가 모두 동시에 블랙잭인 경우 플레이어는 베팅한 금액을 돌려받는다.
* 딜러는 처음에 받은 2장의 합계가 16이하이면 반드시 1장의 카드를 추가로 받아야 하고, 17점 이상이면 추가로 받을 수 없다. 
* 딜러가 21을 초과하면 그 시점까지 남아 있던 플레이어들은 가지고 있는 패에 상관 없이 승리해 베팅 금액을 받는다.
```

### 기능 구현 목록
* 사람 이름 입력받는 기능
* 입력받은 사람이름의 배팅금액을 입력받는 기능
* 기본적으로 2장받는 카드를 나누어주는 기능
* 모든 player, dealer까지 카드를 더 받을지 말지 결정을 묻는 기능
  * 'n'이 나올때까지 카드를 계속 뽑을 수 있음
  * 단, 카드를 추가로 뽑아서 21이 넘으면 배팅금액을 모두 잃음
* 카드의 숫자의 합이 16이하이면 반드시 한장을 추가로 받는 기능.
  * 17이상이면 추가로 받을 수 없음
* 달로거 21을 초과하면 그 시점까지 남아있던 플레이어들은 패에 상관없이 승리, 배팅금액을 받음
* 딜러와 모든 플레이어들이 받은 카드와 카드숫자 합을 print 하는 기능
* dealer포함 각 player들의 최종수익을 출력하는 기능

