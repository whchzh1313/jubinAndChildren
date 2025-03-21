package com.example.jubinandchildren

data class MyPageData(
    val profile: Profile,
    var genres: Array<Int>,
    val gamePicks: Array<GamePick>,
    val libraryPicturesIds: IntArray
)

data class Profile(
    val name: String,
    val isMan: Boolean,
    val description: String,
    val image: Int,
)

data class GamePick(
    val title: String,
    val description: String,
    val image: Int
)

object MyPageDataObject {
    val myPageDataMap: MutableMap<String, MyPageData> = mutableMapOf()
    var isDataInitialized = false

    fun initData() {
        if (!isDataInitialized) {
            myPageDataMap["orinugoori9"] =
                MyPageData(
                    Profile("김현지", false, "롤조아~ 롤토체스 조아~", R.drawable.mypage_profile_orinugoori9),
                    arrayOf(StringData.genreId[4], StringData.genreId[2], StringData.genreId[0]),
                    arrayOf(
                        GamePick("리그 오브 레전드", "#AOS #온라인게임 #팀플레이", R.drawable.mypage_gamepick_lol),
                        GamePick("구스 구스 덕", "#추리게임 #마피아 #멀티플레이어", R.drawable.mypage_gamepick_goose),
                        GamePick("슈퍼 버니 맨", "#시뮬레이션 #인디", R.drawable.mypage_gamepick_superbunnyman)
                    ),
                    intArrayOf(
                        R.drawable.mypage_library_vampiresurvivors,
                        R.drawable.mypage_library_planetzoo,
                        R.drawable.mypage_gamepick_goose,
                        R.drawable.mypage_gamepick_superbunnyman,
                        R.drawable.mypage_library_polybridge,
                        R.drawable.mypage_library_islandsofinsight,
                        R.drawable.mypage_library_oxygennotincluded,
                    )
                )
            myPageDataMap["choco"] =
                MyPageData(
                    Profile("이화민", true,"있는게임 다해요! 일단 맛부터 보는 편!", R.drawable.mypage_profile_choco),
                    arrayOf(StringData.genreId[1], StringData.genreId[3], StringData.genreId[2]),
                    arrayOf(
                        GamePick("팩토리오", "#샌드박스 #건설_경영_시뮬레이션 #타워_디펜스 #할인_절대로_안함", R.drawable.mypage_gamepick_factorio),
                        GamePick("코어키퍼", "#샌드박스 #어드벤처 #할인때만_구매추천", R.drawable.mypage_gamepick_corekeeper),
                        GamePick("고스트리콘", "#FPS #택티컬_슈터 #할인때만_구매추천", R.drawable.mypage_gamepick_ghostrecon)
                    ),
                    intArrayOf(
                        R.drawable.mypage_library_corekeeper,
                        R.drawable.mypage_library_factorio,
                        R.drawable.mypage_library_ghostrecon,
                        R.drawable.mypage_library_palworld,
                        R.drawable.mypage_library_party,
                        R.drawable.mypage_library_rainbow,
                    )
                )
            myPageDataMap["mwamwa"] =
                MyPageData(
                    Profile("황주빈", false,"말랑해요", R.drawable.mypage_profile_mwamwa),
                    arrayOf(StringData.genreId[3], StringData.genreId[4], StringData.genreId[2]),
                    arrayOf(
                        GamePick("프로젝트 좀보이드", "# 오픈월드 #RPG #인디", R.drawable.mypage_gamepick_projectzomboid),
                        GamePick("스타듀밸리", "#농사 #힐링  #인디", R.drawable.mypage_gamepick_stardewvalley),
                        GamePick("돈스타브 투게더", "# 오픈월드 #시뮬레이션 #인디", R.drawable.mypage_gamepick_dontstarvetogether)
                    ),
                    intArrayOf(
                        R.drawable.mypage_gamepick_projectzomboid,
                        R.drawable.mypage_gamepick_dontstarvetogether,
                        R.drawable.mypage_gamepick_stardewvalley,
                        R.drawable.mypage_library_rustysretirement,
                        R.drawable.mypage_gamepick_goose,
                        R.drawable.mypage_library_humanfallflat,
                        R.drawable.mypage_library_prisonarchitect,
                    )
                )
            myPageDataMap["ruruha545"] =
                MyPageData(
                    Profile("박정호", true,"월오쉽 2만판 55퍼 굿맨 KEINE클랜 머장", R.drawable.mypage_profile_ruruha545),
                    arrayOf(StringData.genreId[1], StringData.genreId[0], StringData.genreId[2]),
                    arrayOf(
                        GamePick("월드오브워쉽", "#슈팅, #MMO", R.drawable.mypage_gamepick_worldofworships),
                        GamePick("배틀그라운드", "#배틀로얄, #FPS", R.drawable.mypage_gamepick_pubg),
                        GamePick("코드 베인", "#소울라이크", R.drawable.mypage_gamepick_codevein)
                    ),
                    intArrayOf(
                        R.drawable.mypage_gamepick_worldofworships,
                        R.drawable.mypage_gamepick_pubg,
                        R.drawable.mypage_gamepick_codevein,
                        R.drawable.mypage_library_wows1,
                        R.drawable.mypage_library_wows2,
                        R.drawable.mypage_library_wows3,
                        R.drawable.mypage_library_wows4,
                        R.drawable.mypage_library_wows5,
                        R.drawable.mypage_library_wows6,
                        R.drawable.mypage_library_pubg1,
                        R.drawable.mypage_library_pubg2,
                        R.drawable.mypage_library_pubg3,
                        R.drawable.mypage_library_pubg4,
                        R.drawable.mypage_library_pubg5,
                    )
                )
            myPageDataMap["apape"] =
                MyPageData(
                    Profile("공명선", true,"아무것도 안 하고 사는 게 꿈", R.drawable.mypage_profile_apape),
                    arrayOf(StringData.genreId[2], StringData.genreId[5], StringData.genreId[0]),
                    arrayOf(
                        GamePick("젤다의 전설", "#오픈월드, #짱재밌음", R.drawable.game_cover_zelda),
                        GamePick("포켓몬스터", "#RPG #추억", R.drawable.mypage_library_pokemonsv),
                        GamePick("휴먼 폴 플랫", "#퍼즐 #멀티", R.drawable.mypage_library_humanfallflat)
                    ),
                    intArrayOf(
                        R.drawable.game_cover_zelda,
                        R.drawable.game_cover_cyberpunk_2077,
                        R.drawable.game_cover_gta_5,
                        R.drawable.mypage_library_raft,
                        R.drawable.mypage_library_ahatintime,
                        R.drawable.mypage_library_oneshot,
                        R.drawable.mypage_library_undertale,
                        R.drawable.mypage_library_ori1,
                        R.drawable.mypage_library_ori2,
                        R.drawable.game_cover_human_fall_flat,
                        R.drawable.mypage_library_dbd,
                        R.drawable.mypage_library_pokemonsv,
                        R.drawable.mypage_library_aaf123,
                        R.drawable.mypage_gamepick_lol,
                        R.drawable.img_minecraft_main
                    )
                )
            isDataInitialized = true
        }
    }

    // 데이터 추가
    fun addData(id: String) {
        if(!isDataContains(id)) {
            println(StringData.dataString[3])
            myPageDataMap[id] =
                MyPageData(
                    Profile(
                        (UserDataObject.getUserData(id).userName ?: R.string.mypage_profile_name).toString(),
                        UserDataObject.getUserData(id).isMan ?: true,
                        StringData.dataString[0],
                        R.drawable.mypage_profile_base_image),
                    UserDataObject.getUserData(id).userGenre.map{StringData.genreId[it ?: 7]}.toTypedArray() ?: arrayOf(7, 7, 7),
                    arrayOf(
                        GamePick("?", StringData.dataString[3], R.drawable.mypage_missing),
                        GamePick("?", StringData.dataString[3], R.drawable.mypage_missing),
                        GamePick("?", StringData.dataString[3], R.drawable.mypage_missing)
                    ),
                    intArrayOf(

                    )
                )
            while(myPageDataMap[id]!!.genres.size < 3) {
                myPageDataMap[id]!!.genres += 7
            }
        }
    }

    private fun isDataContains(id: String): Boolean = myPageDataMap.keys.contains(id)

    // 데이터 가져오기
    fun getMyData(id: String): MyPageData {
        addData(id)
        return myPageDataMap[id]!!
    }

}




